package tutorial21_inheritance;

public class Inheritance {

    public static void main(String[] args) {

        Machine machine = new Machine();
        machine.start();
        machine.stop();
        Car car = new Car();
        car.start();
        car.wipeWindShield();
        car.showInfo();
        car.stop();
    }
}
