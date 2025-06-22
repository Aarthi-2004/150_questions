// Re-arranged array by small – largest combination
// Input: [1, 3, 5, 2, 8, 7, 4]
// Output:[1, 8, 2, 7, 3, 5, 4]
import java.util.Arrays;

public class RearrangeSmallLarge {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 8, 7, 4};
        Arrays.sort(arr);

        // Create a temporary array to store result
        int[] result = new int[arr.length];

        int start = 0;                  // Pointer to the smallest element
        int end = arr.length - 1;       // Pointer to the largest element
        boolean turn = true;            // True for smallest, false for largest

        for (int i = 0; i < arr.length; i++) {
            if (turn) {
                result[i] = arr[start++];
            } else {
                result[i] = arr[end--];
            }
            turn = !turn; // Alternate turns
        }

        // Print the rearranged array
        System.out.print("Rearranged array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
