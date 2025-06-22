public class HourGlass {
    public static void main(String[] args) {
        int n = 8;

        // Top Half - Reverse Hill (Inverted Triangle)
        for (int i = 1; i < n; i++) {
            // Increasing spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // Decreasing stars
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Bottom Half - Hill (Normal Triangle)
        for (int i = 1; i <= n; i++) {
            // Decreasing spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Increasing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}