import java.util.Scanner;

public class Solution {
    public static String ifPrime(int number) {
        if (number <= 1) {
            return "Not prime";
        } else if (number <= 3) {
            return "Prime";
        } else if (number % 2 == 0 || number % 3 == 0) {
            return "Not prime";
        } else {
            int temp = 5;
            while (temp * temp < number) {
                if (number % temp == 0 || number % (temp + 2) == 0) {
                    return "Not prime";
                }
                temp = temp + 6;
            }
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
