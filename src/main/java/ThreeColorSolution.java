class ThreeColorSolution {
    public void sortColors(int[] nums) {
        int i = 0;
        int k = nums.length-1;
        int j = 0;

        if(k == 0 || k == -1)
            return;

        while (i < nums.length && nums[i] == 0)
            i++;
        while (nums[k] == 2 && k > 0)
            k--;

        j = i;
        while (j <= k) {
            if (nums[j] == 0) {
                if (i!=j)  swap(nums, i, j);
                i++;
                j++;
            } else if (nums[j] == 2) {
                if(j!=k)    swap(nums, j, k);
                k--;
            } else {
                j++;
            }
        }
    }

    private static void swap(int[] input, int i, int j) {
        input[i] = input[i] ^ input[j];
        input[j] = input[i] ^ input[j];
        input[i] = input[i] ^ input[j];
    }

}