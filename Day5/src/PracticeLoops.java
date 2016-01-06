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
    public static void practiceDoWhileLoop(){
        int x = 0;
        do {
            System.out.println("Value of x is "+ x);
            x++;
        }while (x<5);
    }
    public static void main(String[] args) {
        practiceDoWhileLoop();
    }
}
