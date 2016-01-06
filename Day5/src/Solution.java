import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static int getNumberOfTestcases() {
        Scanner numberOfTestcases = new Scanner(System.in);
        return numberOfTestcases.nextInt();
    }

    public static String printResult(StringBuilder stringBuilder) {
        return stringBuilder.toString();
    }

    public static void main(String[] args) {

        ArrayList<String> results = new ArrayList<>();
        for (int x = 0; x < getNumberOfTestcases(); x++) {
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
            results.add(x, result.toString());
        }
        for (int x = 0; x < getNumberOfTestcases(); x++) {
            System.out.println(results.get(x));
        }

    }
}

