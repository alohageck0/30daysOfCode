/**
 * Created by Evgenii on 1/5/2016.
 */
public class PracticeLoops {

    public static void practiceWhileLoop() {
        int x = 0;
        while (x < 5) {
            System.out.println("Value of x is " + x);
            x++;
        }
    }

    public static void practiceDoWhileLoop() {
        int x = 0;
        do {
            System.out.println("Value of x is " + x);
            x++;
        } while (x < 5);
    }

    public static void practiceForLoop() {
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                System.out.println("(" + x + ", " + y + ")");

            }

        }
    }

    public static void main(String[] args) {
        practiceForLoop();
    }
}
