
public class Person {
    HairColor hairColor = HairColor.BLACK;
    Person(){

    }

    public static void main(String[] args) {
        Person peterParker = new Person();
        Person spiderMan = peterParker;
        spiderMan.hairColor = HairColor.PINK;

        System.out.println("Haircolor of PP "+ peterParker.hairColor);
        System.out.println("Haircolor of Spider "+ spiderMan.hairColor);
    }
}
