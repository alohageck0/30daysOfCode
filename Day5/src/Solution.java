import java.util.Scanner;

public class Solution {
    public static int getNumberOfTestcases() {
        Scanner numberOfTestcases = new Scanner(System.in);
        return numberOfTestcases.nextInt();
    }

    public static void main(String[] args) {
        int n = getNumberOfTestcases();
        for (int x = 0; x < n; x++) {
            Scanner strin = new Scanner(System.in);
            int a = strin.nextInt();
            int b = strin.nextInt();
            int N = strin.nextInt();
            int sum = 0;
            for (int y = 0; y < N; y++) {
                if (y == 0) {
                    sum = a + b;
                    System.out.print(sum);
                } else {
                    sum = (int) (sum + Math.pow(2, y) * b);
                }
                System.out.print(" " + sum);
            }
        }


    }
}

