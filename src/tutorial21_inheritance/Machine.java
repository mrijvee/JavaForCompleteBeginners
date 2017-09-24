package tutorial21_inheritance;

public class Machine {

    protected String name = "Sayiyan type 1"; //Protected means it can be accessed from its child class as well (Car). With private, it can only be accessed within the Sayiyan class

    public void start() { //We can do method overriding with this in Car.java class
        System.out.println("Sayiyan started");
    }

    public void stop() {
        System.out.println("Sayiyan stopped");
    }
}
