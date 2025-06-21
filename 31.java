import java.util.Scanner;

 class AscendingOrderCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int last = num % 10;
        boolean isAscending = true;

        for (num = num / 10; num > 0; num = num / 10) {
            int next = num % 10;
            if (next > last) {
                isAscending = false;
                break;
            }
            last = next;
        }

        System.out.println(isAscending ? "Yes" : "No");
    }
}

