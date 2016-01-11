import java.util.Scanner;

public class Solution {

    public static String toBinary(int decimal, StringBuilder result) {
        if (decimal == 0) {
            result.append(1);
            return result.reverse().toString();
        }
        while (decimal != 1) {
            int reminder = decimal % 2;
            result.append(reminder);
            return toBinary(decimal / 2, result);
        }
        result.append(0);
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for (int n = 0; n < testcases; n++) {
            StringBuilder result = new StringBuilder();
            int testcase = sc.nextInt();
            toBinary(testcase, result);
            System.out.println(result.reverse().toString());
        }
    }
}
