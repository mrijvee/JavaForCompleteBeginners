package tutorial21_inheritance;

public class Car extends Machine {

    @Override
    public void start() {
        System.out.println("Car started");
    }

    public void wipeWindShield() {
        System.out.println("Wiping windshield");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    public void showInfo() {
        System.out.println("Car name: " + name);
    }
}
