import java.util.*;

public class MaximumSwap {

    public int maximumSwap(int num) {
        Map<Integer, Integer> splitNum = split(num);
        List<Integer> values = new ArrayList<>(splitNum.values());
        values.sort(Collections.reverseOrder());
        System.out.println(values);
        return swap(splitNum, values);
    }

    private int swap(Map<Integer, Integer> splitNum, List<Integer> sorted) {
        for (int i = 0; i < sorted.size(); i++) {
            List<Integer> pos = getPositionOf(sorted.get(i), splitNum);
            if (pos.contains(sorted.size() - i))
                continue;
            swapPositions(splitNum, pos.get(0), sorted.size() - i);
            break;
        }
        return convertToNum(splitNum);
    }

    private int convertToNum(Map<Integer, Integer> splitNum) {
        int number = 0;
        for (Map.Entry<Integer, Integer> entry : splitNum.entrySet()) {
            number += Math.pow(10, (entry.getKey()-1)) * entry.getValue();
        }
        return number;
    }

    private void swapPositions(Map<Integer, Integer> splitNum, Integer first, int second) {
        int temp = splitNum.get(first);
        splitNum.put(first, splitNum.get(second));
        splitNum.put(second, temp);
    }

    private List<Integer> getPositionOf(Integer value, Map<Integer, Integer> splitNum) {
        List<Integer> positions = new ArrayList<>();
        for (Map.Entry entry : splitNum.entrySet()) {
            if (entry.getValue().equals(value)) positions.add((Integer) entry.getKey());
        }
        return positions;
    }

    private Map<Integer, Integer> split(int num) {
        Map<Integer, Integer> numIndexMap = new HashMap<>();
        int i = 1;
        int max = 0;
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            numIndexMap.put(i, rem);
            if (max < rem) max = rem;
            i++;
        }
        return numIndexMap;
    }
}
