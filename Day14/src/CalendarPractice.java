import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarPractice {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 100);
        System.out.println(calendar.getTime());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String formated = format.format(calendar.getTime());
        System.out.println(formated);
    }
}
