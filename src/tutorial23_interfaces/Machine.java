package tutorial23_interfaces;

public class Machine implements Info{ //Cannot extend an Interface. You can only implement

    private int id = 7;

    public void start() {
        System.out.println("Machine started");
    }

    @Override
    public void showInfo() {
        System.out.println("Machine id is: " + id);
    }
}
