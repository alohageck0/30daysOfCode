import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String rr = "#";
        int n = s.nextInt();
        for (int x = n-1; x >= 0; x--) {

            System.out.println(rr.join("", Collections.nCopies(x, " "))
                    + rr.join("", Collections.nCopies(n - x, rr)));
        }
    }
}

