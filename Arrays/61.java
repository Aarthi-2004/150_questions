//Group Reverse
//int a[] = { 10, 20, 30, 40, 50, 25, 35, 45 }; d=3
//Expected OP: 30 20 10 45 35 25 50 40
import java.util.*;
 class GroupReverse {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 25, 35, 45};
        int d = 3;
        int n = a.length;
        for (int i = 0; i <n; i += d) {
            int end = Math.min(i+d-1,n-1);
           for (int j = end; j >= i; j--) {
                System.out.print(a[j] + " ");
            }
        }
    }
}
