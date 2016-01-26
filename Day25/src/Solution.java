import java.util.Scanner;

public class Solution {
    public static String ifPrime(long number) {
        if (number == 2 || number == 3 || number == 5 || number == 7 || number == 11) {
            return "Prime";
        } else if (number % 2 == 0 || number == 1 || number == 0) {
            return "Not prime";
        } else {
            for (int i = 3; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return "Not prime";
                } else {
                    return "Prime";
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            System.out.println(ifPrime(sc.nextInt()));
        }
    }


}
