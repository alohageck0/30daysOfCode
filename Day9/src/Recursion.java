public class Recursion {
    //
    public static int summation(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + summation(n - 1);
        }
    }

    public static int factorial(int n) {
        //Base case
        if (n <= 1) {
            return 1;
        } else {
            //recursive case
            return n * factorial(n - 1);
        }
    }

    public static int exponentiation(int n, int p) {
        //Base case
        if (p <= 0) {
            return 1;
        } else {
            return n * exponentiation(n, p - 1);
        }
    }

    public static void main(String[] args) {
//        System.out.println(summation(3));
//        System.out.println(factorial(5));
//        System.out.println(exponentiation(5, 3));
        System.out.println(96%420);
        System.out.println(420%96);
        String test = new String();
        test = "ABCFGHFGH";
        System.out.println(test.contains("fgh"));

    }
}
