
public class first {

    public static void main(String[] args) {
        System.out.println("hello rohit");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}