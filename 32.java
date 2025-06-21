import java.util.Scanner;

 class SteppingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();

        int x, y;
        boolean isStepping = true;

        y = a % 10;
        a = a / 10;

        while (a > 0) {
            x = a % 10;

            if (Math.abs(x - y) != 1) {
                isStepping = false;
                break;
            }

            y = x;
            a = a / 10;
        }

        if (a==0) {
            System.out.println("Stepping number");
        } else {
            System.out.println("Not a stepping number");
        }
    }
}
