import java.util.Scanner;

class RSF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int prevDigit = -1;
        int result = 0;
        int place = 1;

        while (num > 0) {
            int currDigit = num % 10;
            num = num / 10;

            if (prevDigit != -1) {
                int diff = prevDigit - currDigit;
                if (diff < 0) diff = -diff;
                result = result + diff * place;
                place = place * 10;
            }

            prevDigit = currDigit;
        }

        System.out.println("RSF Output: " + result);
    }
}
