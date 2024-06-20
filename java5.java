public class java5 {
    public static void main(String[] args) {

        int r = 5;

        for (int i = 1; i <= r; i++) {
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
    }
}