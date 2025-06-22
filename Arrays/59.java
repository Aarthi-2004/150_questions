// Remove all duplicates in an array sample input and output
// Input:[1, 2, 2, 3, 4, 4, 5]
// Output:[1, 2, 3, 4, 5]
import java.util.Arrays;
 class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Use a temporary array to store unique elements
        int[] temp = new int[arr.length];
        int j = 0;

        // Step 3: Loop through the array and skip duplicates
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }

        // Add the last element
        temp[j++] = arr[arr.length - 1];

        // Print result
        System.out.print("Output: ");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
