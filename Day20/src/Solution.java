import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String delimiters = "![,?.\\_'@+] ";
        String s = sc.nextLine();
        StringTokenizer result = new StringTokenizer(s, delimiters);
        System.out.println(result.countTokens());
        for (int i = 0; i <= result.countTokens(); i++) {
            System.out.println(result.nextToken());
        }
    }
}
