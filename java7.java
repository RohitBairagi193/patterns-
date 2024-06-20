public class java7 {
    public static void main(String[] args) {

        int r = 5;
        for (int i = 1; i < r; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            // second

            for (int j = r; j > i; j--) {
                System.out.print("  ");
            }

            // third

            for (int j = r; j > i; j--) {
                System.out.print("  ");
            }
            // four
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == r || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // next section
        for (int i = r; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            // second

            for (int j = r; j > i; j--) {
                System.out.print("  ");
            }

            // third

            for (int j = r; j > i; j--) {
                System.out.print("  ");
            }
            // four
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
