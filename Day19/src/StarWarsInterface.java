import java.util.Random;
import java.util.regex.Matcher;

class StarWarsInterfacea {
    public static Character summonCharacter() {
        Random random = new Random();
        if (Math.abs(random.nextInt() % 2) == 0) {
            return new Enemy();
        } else {
            return new Hero();
        }
    }

    public static void main(String[] args) {
        Enemy dartWader = new Enemy();
        Hero ObiWanKenobi = new Hero();
        dartWader.attack();
        ObiWanKenobi.attack();
        dartWader.heal();
        ObiWanKenobi.heal();
        System.out.println(dartWader.getWeapon());
        System.out.println(ObiWanKenobi.getWeapon());
        Character spy = summonCharacter();
        spy.attack();
        spy.heal();
    }
}
