public class Solution {
    public static int globalCommonDivisor(int x, int y) {
        if (y % x == 0) {
            return x;
        } else {
            return globalCommonDivisor(x, y - (y%x));
        }
    }

    public static void main(String[] args) {
        System.out.println(globalCommonDivisor(3, 4));
    }
}
