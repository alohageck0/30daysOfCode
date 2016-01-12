
public class Animal {
    private int age; // vs. private
    public Animal(int age){
        this.age = age;
        System.out.println("An animal has been crated!");
    }

    public int getAge() {
        return age;
    }

    public void eat(){
        System.out.println("An animal is eating");
    }
    public static void main(String[] args) {
        Animal a = new Animal(5);
        Dog b = new Dog();
        Cat c = new Cat();
        b.ruff();
        System.out.println(b.getAge());
        c.moew();
        System.out.println(c.getAge());
        a.eat();
        b.eat();
        c.eat();
        b.run();
        c.prance();

        //What happens
//        Animal o = new Dog();
//        o.eat();

    }
}
