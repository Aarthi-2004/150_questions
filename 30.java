import java.util.Scanner;

public class CountOddEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        int odd = 0, even = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit % 2 == 0)
                even++;
            else
                odd++;

            num = num / 10;
        }

        System.out.println("Odd = " + odd);
        System.out.println("Even = " + even);
    }
}

