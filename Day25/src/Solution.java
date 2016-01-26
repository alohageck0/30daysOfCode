import java.util.Scanner;

public class Solution {
    public static String ifPrime(int number) {
        if (number % 2 == 0 && number != 2) {
            return "Not prime";
        }
        return "Prime";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            System.out.println(ifPrime(sc.nextInt()));
        }
    }


}
