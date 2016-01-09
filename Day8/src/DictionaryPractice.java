import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {
    public static void main(String[] args) {
        // English-spanish dictinonary
        Map<String, String> englSpanDict = new HashMap<String, String>();
        englSpanDict.put("Monday", "Lunas");
        englSpanDict.put("Tuesday","Martes");
        englSpanDict.put("Wednsday","Miércoles");
        englSpanDict.put("Thursday","Jueves");
        englSpanDict.put("Friday","Viernes");
        //Retreive things
        System.out.println(englSpanDict.get("Monday"));
        System.out.println(englSpanDict.get("Tuesday"));
        System.out.println(englSpanDict.get("Wednsday"));
    }
}
