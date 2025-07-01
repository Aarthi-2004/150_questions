//Find common elements between 2 arrays.
//Input : a[] = {1, 2, 1, 3, 1}
//b[] = {3, 1, 3, 4, 1}
//Output : {1, 3, 1}
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 1, 3, 1};
        int[] b = {3, 1, 3, 4, 1};
        Map<Integer, Integer> freqB = new HashMap<>();
        for (int num : b) {
            freqB.put(num, freqB.getOrDefault(num, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (int num : a) {
            if (freqB.containsKey(num) && freqB.get(num) > 0) {
                result.add(num);
                freqB.put(num, freqB.get(num) - 1); 
            }
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i != result.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
