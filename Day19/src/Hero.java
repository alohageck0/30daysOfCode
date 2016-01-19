
public class Hero implements Character {
    public String weapon = "Lightsaber";
//adasd
    public Hero(){

    }
    @Override
    public void attack() {
        System.out.println("The hero attacks enemy");
    }

    @Override
    public void heal() {
        System.out.println("The hero heals you");
    }

    @Override
    public String getWeapon() {
        return weapon;
    }
}
