import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> input = new ArrayList<>();
        while (N-- != 0) {
            input.add(sc.nextInt());
        }
        Object[] sorted = input.toArray();
        Arrays.sort(sorted);
        int diff = Math.abs((int) sorted[1] - (int) sorted[0]);
        for (int i = 1; i < sorted.length - 1; i++) {
            if (((int) sorted[i + 1] - (int) sorted[i]) < diff) {
                diff = (int) sorted[i + 1] - (int) sorted[i];
            }
        }
        for (int i = 0; i < sorted.length; i++) {
            int newDiff = (int) sorted[i + 1] - (int) sorted[i];
            if (diff == newDiff) {
                System.out.print(sorted[i] + " " + sorted[i + 1]);
            }
        }
    }
}
