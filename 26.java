
//Program to print the sum of odd numbers and arrangement of odd sequence
//I/P: 361589
//Op:315968
import java.util.Scanner;
public class OddDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int rev = 0, sum = 0, temp = num;
        for (int n = num; n > 0; n /= 10) {
            rev = rev * 10 + n % 10;
        }
        while (rev > 0) {
            int digit = rev % 10;
            if (digit % 2 == 1) {
                System.out.print(digit); 
                sum += digit;            
            }
            rev = rev / 10;
        }

        System.out.print(sum); 
    }
}

