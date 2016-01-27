import java.util.Calendar;
import java.util.Scanner;

public class Solution {
    static class MyDate {
        int DATE;
        int MONTH;
        int YEAR;

        public MyDate(Scanner sc) {
            this.DATE = sc.nextInt();
            this.MONTH = sc.nextInt();
            this.YEAR = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyDate actualDate = new MyDate(sc);
        MyDate returnDate = new MyDate(sc);

        if (actualDate.MONTH == returnDate.MONTH && actualDate.YEAR == returnDate.YEAR && actualDate.DATE > returnDate.DATE) {
            System.out.println((actualDate.DATE - returnDate.DATE) * 15);
        } else if (actualDate.YEAR == returnDate.YEAR && actualDate.MONTH > returnDate.MONTH) {
            System.out.println((actualDate.MONTH - returnDate.MONTH) * 500);
        } else if (actualDate.YEAR > returnDate.YEAR) {
            System.out.println(10000);
        } else {
            System.out.println(0);
        }
    }
}
