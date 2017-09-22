package tutorial17_constructors;

class Machine {
    private String name;
    private int code;
    public Machine() { //A constructor uniquely doesn't have any return type and the name of the constructor is the same as the class
        this("Brenda", 33);
        System.out.println("Constructor running");
        name = "Annie";
    }
    public Machine(String name) { //Constructor with parameters
        this(name, 2);
        System.out.println("Second constructor running");
        this.name = name;
    }
    public Machine(String name, int code) {
        System.out.println("Third constructor running");
        this.name = name;
        this.code = code;
    }
}

public class Constructors {

    public static void main(String[] args) {
        Machine machine = new Machine();
        new Machine(); //will print Constructor running again
        new Machine("Bertie");
        new Machine("Annie", 30);
    }
}
