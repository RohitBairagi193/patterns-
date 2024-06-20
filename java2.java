public class java2 {
    public static void main(String[] args) {
        int r = 5;

        // for (int i = 1; i <= r; i++) {
        // for (int j = 1; j <= r; j++) {
        // if (i == 1 || j == 1 || i == r || j == r) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        for (int i = 1; i < r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= r; k++) {
                if (i == 1 || k == 1 || i == r || k == r) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= r; i++) {
            for (int j = r; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= r; k++) {
                if (i == 1 || k == 1 || i == r || k == r) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
