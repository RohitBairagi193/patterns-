public class java4 {
    public static void main(String[] args) {

        int r = 5;
        for (int i = 1; i < r; i++) {
            for (int j = r; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                if (i == r || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            for (int j = 1; j <= i; j++) {
                if (i == r || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        // second
        for (int i = r; i >= 1; i--) {
            for (int j = r; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                if (j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

    }
}
