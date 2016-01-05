import java.util.Random;
import java.util.Scanner;

public class GessTheNumber {
    int number;
    int max;
    Scanner scanner = new Scanner(System.in);

    public GessTheNumber(int maxValue) {
        max = maxValue;
        Random rand = new Random();
        number = Math.abs(rand.nextInt()) % (max + 1);
    }

    public void play() {
        while (true) {
            int move = scanner.nextInt();
            if (move > number) {
                System.out.println("smaller");
            } else if (move < number) {
                System.out.println("greater");
            } else {
                System.out.println("YES");
                break;
            }
        }
    }

    public static void howBigIsMyNumber(int x) {
        if (x >= 0 && x < 10) {
            System.out.println("Number is pretty small");
        } else if (x >= 11 && x < 100) {
            System.out.println("Number is bug");
        } else {
            System.out.println("Out of range");
        }

    }

    public static void main(String[] args) {
        GessTheNumber guess = new GessTheNumber(100);
        guess.play();
    }
}
