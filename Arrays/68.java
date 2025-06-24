// Given an integer array find the duplicate element which has the longest distance
// note: Assumed -1 as output if no duplicates are found
// int arr[]={1,2,3,1,3,4,2,5,6,1};
// O/p: 1
import java.util.*;
class Main{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 3, 4, 2, 5, 6, 1};
        System.out.println("Output: " + findLongestDistanceDuplicate(arr));
    }

    public static int findLongestDistanceDuplicate(int[] arr) {
        int maxDistance = 0;
        int result = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[i] == arr[j]) {
                    int distance = j - i;
                    if (distance > maxDistance) {
                        maxDistance = distance;
                        result = arr[i];
                    }
                    break; 
                }
            }
        }

        return result;
    }
}

