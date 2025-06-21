import java.util.Scanner;
class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum = sum + num % 10;
                num = num / 10;
            }
            num = sum;
        }

        if (num == 1) {
            System.out.println("This is a Magic Number");
        } else {
            System.out.println("This is NOT a Magic Number");
        }
    }
}