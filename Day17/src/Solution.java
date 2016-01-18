import java.util.Scanner;

class Calculator {
    public Calculator() {
    }

    public int power(int inputN, int inputP) throws negativeException {
        if (inputN < 0 || inputP < 0) {
            throw new negativeException("n and p should be non-negative");
        } else {
            return (int) Math.pow(inputN, inputP);
        }
    }

}

class negativeException extends Exception {

    public negativeException(String message) {
        super(message);
    }
}

class Solution {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}

