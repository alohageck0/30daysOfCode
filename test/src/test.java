import java.util.Scanner;

public class test {
    public static boolean ifFunny(String strin) {
        boolean result = true;
        StringBuilder rev = new StringBuilder(strin);
        String reversed = rev.reverse().toString();
        int n = strin.length() - 1;
        for (int i = 0; i < n; i++) {

            System.out.println(strin.charAt(i + 1) + " " + strin.charAt(i));
            System.out.println(reversed.charAt(i + 1) + " " + reversed.charAt(i));
            System.out.println(reversed);
//            if (Math.abs((int) strin.charAt(i+1) - (int) strin.charAt(i)) != Math.abs((int) strin.charAt(n - i) - (int) strin.charAt(n - i - 1))) {
//                result = false;
//            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            System.out.println(ifFunny(sc.next()));
        }
    }
}
