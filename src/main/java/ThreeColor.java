
import java.util.List;

public class ThreeColor {

    public void calculate(List<Integer> input) {
        int i = 0;
        int k = input.size();
        int j = 0;

        while (input.get(i) == 0)
            i++;
        while (input.get(k - 1) == 2)
            k--;

        j = i;
        while (j <= k) {
            if (input.get(j) == 0) {
                swap(input, i, j);
                i++;
                j++;
            } else if (input.get(j) == 2) {
                swap(input, j, k);
                k--;
            } else {
                j++;
            }
        }
    }

    private void swap(List<Integer> input, int i, int j) {
        int temp = input.get(i);
        input.set(i, input.get(j));
        input.set(j, temp);
    }

}
