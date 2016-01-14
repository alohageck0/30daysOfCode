
public abstract class Animal {
    private int age; // vs. private

    public Animal(int age) {
        this.age = age;
        System.out.println("An animal has been crated!");
    }

    public int getAge() {
        return age;
    }

    public abstract void eat();

    public void sleep() {
        System.out.println("An animal is sleeping");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.eat();
        c.eat();
        d.sleep();
        c.sleep();

        //Casting
        Object dog = new Dog();
        Dog realDog = (Dog) dog;
        Dog testDog = new Dog();
        Object str = "est";
        String realS = (String) str;

        //What happens when
        Dog doggy = new Dog();
        if (d instanceof Animal) {
            Animal animal = (Animal) doggy;
            animal.sleep();
        }
        doggy.sleep();
    }
}
