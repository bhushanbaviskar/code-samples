import java.util.*;

public class GrayCode {

    private Map<Integer, List<Integer>> codeCache;

    GrayCode() {
        this.codeCache = new HashMap<>();
    }

    public List<Integer> generate(int n) {
        if (n == 0) return Collections.singletonList(0);
        if (n == 1) return Arrays.asList(0,1);
        List<Integer> grayCodes = new LinkedList<>(Arrays.asList(0,1));
        for (int i = 2; i <= n; i++) {
            int prefix = (int) Math.pow(2, i - 1);
            for (int j = grayCodes.size() - 1; j >= 0; j--)
                grayCodes.add(prefix + grayCodes.get(j));
        }
        return grayCodes;
    }

    public static void main(String[] args) {
        new GrayCode().generate(2);
    }
}
