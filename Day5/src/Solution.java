import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int i = 0, c = s.nextInt(); i < c; i++) {
            for (int k = 0, a = s.nextInt(), b = s.nextInt(), n = s.nextInt(); k < n; k++)
                System.out.print((a += b * (int) Math.pow(2, k)) + " ");
            System.out.println();
        }
    }
}

