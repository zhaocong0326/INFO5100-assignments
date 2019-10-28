import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsOccurrencesUnique {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (Integer n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (set.contains(entry.getValue())) {
                return false;
            }
            set.add(entry.getValue());
        }
        return true;
    }
}

class Test {
    public static void main(String[] args) {
        IsOccurrencesUnique test = new IsOccurrencesUnique();
        int[] arr = {1,2,2,1,1,3};
        int[] arr2 = {1,2};
        int[] arr3 = {-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(test.uniqueOccurrences(arr) +
                "\n" + test.uniqueOccurrences(arr2) +
                "\n" + test.uniqueOccurrences(arr3));
    }
}
