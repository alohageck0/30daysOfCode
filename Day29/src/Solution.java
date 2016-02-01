import java.util.Scanner;

public class Solution {
    public static boolean ifFunny(String strin) {
        boolean result = true;
        StringBuilder rev = new StringBuilder(strin);
        int n = strin.length() - 1;
        for (int i = 0; i < n; i++) {
            if (Math.abs((int) strin.charAt(i + 1) - (int) strin.charAt(i)) !=
                    Math.abs((int) rev.reverse().toString().charAt(i + 1) - (int) rev.reverse().toString().charAt(i))) {
                result = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            if (ifFunny(sc.nextLine())) {
                System.out.println("Funny");
            } else {
                System.out.println("Not Funny");
            }

        }
    }
}
