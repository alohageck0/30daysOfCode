public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 4079;
    boolean isTheCarOn = false;
    char condition = 'A';

    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;
    int numberOfPeopleInCar = 1;
    int maxNumberOfPeople = 6;

    public Car() {

    }

    public Car(int customMaxSpeed, int customMaxFuel, int customMpg) {
        maxSpeed = customMaxSpeed;
        maxFuel = customMaxFuel;
        mpg = customMpg;

    }


    public void printVariables() {
        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(numberOfPeopleInCar);

    }

    public void getIn() {
        if (numberOfPeopleInCar < maxNumberOfPeople) {
            numberOfPeopleInCar++;
        } else {
            System.out.println("The car is full" + numberOfPeopleInCar + " = " + maxNumberOfPeople);
        }
    }

    public void getOut() {
        if (numberOfPeopleInCar != 0) {
            numberOfPeopleInCar--;
        } else {
            System.out.println("No ont in the car");
        }
    }

    public void wreckCar() {
        condition = 'C';
    }


    public void turnCarOn() {
        if (!isTheCarOn) {
            isTheCarOn = true;
        } else {
            System.out.println("The car is already ON");
        }
    }

    public static void main(String[] args) {
        Car presentCar = new Car();
        presentCar.getOut();
        presentCar.getOut();

    }
}
