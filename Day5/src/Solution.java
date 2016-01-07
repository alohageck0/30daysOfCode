import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static int getNumberOfTestcases() {
        Scanner numberOfTestcases = new Scanner(System.in);
        return numberOfTestcases.nextInt();
    }

    public static void main(String[] args) {
        Scanner testcase = new Scanner(System.in);
        ArrayList<String> results = new ArrayList<>();
        int numberOfTests = testcase.nextInt();
//        System.out.println(numberOfTests);
        int x;
        for (x = 0; x < numberOfTests; x++) {
            Scanner strin = new Scanner(System.in);
            int a = strin.nextInt();
            int b = strin.nextInt();
            int N = strin.nextInt();
            int sum = 0;
            StringBuilder result = new StringBuilder();
            for (int y = 0; y < N; y++) {
                if (y == 0) {
                    sum = a + b;
                    result.append(sum);
                } else {
                    sum = (int) (sum + Math.pow(2, y) * b);
                    result.append(" " + sum);
                }
            }
            results.add(result.toString());
        }
        for (x = 0; x < numberOfTests; x++) {
            System.out.println(results.get(x));
        }
    }
}

