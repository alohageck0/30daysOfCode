import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {
    public static void main(String[] args) {
        // English-spanish dictinonary
        Map<String, String> englSpanDict = new HashMap<>();
        englSpanDict.put("Monday", "Lunas");
        englSpanDict.put("Tuesday", "Martes");
        englSpanDict.put("Wednsday", "Miércoles");
        englSpanDict.put("Thursday", "Jueves");
        englSpanDict.put("Friday", "Viernes");
        englSpanDict.put("Saturday", "Sabado");
        //Retreive things
        System.out.println(englSpanDict.get("Monday"));
        System.out.println(englSpanDict.get("Tuesday"));
        System.out.println(englSpanDict.get("Wednsday"));
        //Print key-values
        System.out.println(englSpanDict.keySet());
        System.out.println(englSpanDict.values());
        // Size
        System.out.println(englSpanDict.size());

        System.out.println();
        System.out.println();
        //Shopping list
        Map<String, Boolean> shopList = new HashMap<>();
        shopList.put("Milk", Boolean.TRUE);
        shopList.put("Ham", Boolean.TRUE);
        shopList.put("Bread", Boolean.TRUE);
        shopList.put("Eggs", Boolean.FALSE);
        shopList.put("Sugar", false);
        //Retreive items

        System.out.println(shopList.get("Ham"));
        System.out.println(shopList.get("Bread"));
        System.out.println(shopList.toString());
        //Remove
        shopList.remove("Eggs");

        System.out.println(shopList.toString());
        shopList.replace("Bread", Boolean.FALSE);
        System.out.println(shopList.toString());

        //Clear our dict
        shopList.clear();
        System.out.println(shopList.toString());
        System.out.println(shopList.isEmpty());

    }
}
