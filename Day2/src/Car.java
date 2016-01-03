public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 4079;
    boolean isTheCarOn = false;
    char condition = 'A';

    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;
    int numberOfPeopleInCar = 4;

    public Car(int customMaxSpeed) {
        maxSpeed = customMaxSpeed;
    }


    public void printVariables() {
        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);

    }

    public void wreckCar() {
        condition = 'C';
    }

    public void changeSpeed() {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 3;
    }

    public static void main(String[] args) {
        Car presentCar = new Car(50);
        presentCar.printVariables();
    }
}
