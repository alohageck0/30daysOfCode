import java.util.HashMap;

public class RuntimePractice {
    public static int findNumberOfRepetitions(String s, char c) {
        //linear time O(n)
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                sum++;
            }
        }
        return sum;
    }

    public static int[] findNumsOfrepsV1(String s, char[] c) {
        //Quadratic time; O(n * m) time
        int[] sums = new int[c.length]; //1
        for (int i = 0; i < s.length(); i++) { //1, n+1, n
            for (int j = 0; j < c.length; j++) { // n, n*m+1, n*m
                if (s.charAt(i) == c[j]) {// n*m
                    sums[j] = sums[j] + 1;//n*m
                }
            }
        }
        return sums; //1
    }

    public static int[] find2(String s, char[] c) {
        //Optimal time is O(n)
        int[] sums = new int[c.length]; //1
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                int sum = map.get(s.charAt(i));
                map.put(s.charAt(i), sum++);
            }

        }
        for (int i = 0; i < c.length; i++) {
            int sum;
            if (!map.containsKey(c[i])) {
                sums[i] = 0;
            } else {
                sums[i] = map.get(c[i]);
            }
        }
        return sums;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        System.out.println(findNumberOfRepetitions("adasdas", 'a'));
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Test " + duration + "ms");

        char[] a = {'a', 'b'};
        startTime = System.currentTimeMillis();

        System.out.println(findNumsOfrepsV1("asdjajsdjasjdjasdjjasdjasjdjasjdjasjdjasjdjasdjajsdjasjdjasjdjasjdjasdjjasdjasdjasjdjasjdjasdjasjdjasjdjasdjasjdjasjdajs", a));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test " + duration + "ms");

        startTime = System.currentTimeMillis();

        System.out.println(find2("asdjajsdjasjdjasdjjasdjasjdjasjdjasjdjasjdjasdjajsdjasjdjasjdjasjdjasdjjasdjasdjasjdjasjdjasdjasjdjasjdjasdjasjdjasjdajs", a));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test " + duration + "ms");
    }
}
