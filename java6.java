public class java6 {
    public static void main(String[] args) {

        int r = 5;
        for (int i = 1; i < r; i++) {
            for (int j = 1; j <= i; j++) {

                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
        for (int i = r; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }

}
