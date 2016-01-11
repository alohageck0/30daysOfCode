import java.util.Scanner;

public class Solution {

    public static String toBinary(int decimal, StringBuilder result) {
        while (decimal != 0 || decimal != 1) {
            int reminder = decimal % 2;
            result.append(reminder);
            return toBinary(decimal / 2, result);
        }
        if (decimal == 0) {
            result.append(1);
        } else {
            result.append(0);
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for (int n = 0; n < testcases; n++) {
            StringBuilder result = new StringBuilder();
            int testcase = sc.nextInt();
            while (testcase != 0 || testcase != 1) {
                result.append(testcase % 2);
                testcase = testcase/2;
            }
             if (testcase == 0) {
                result.append(1);
            } else {
                result.append(0);
            }
            System.out.println(result.reverse().toString());
        }
    }
}
