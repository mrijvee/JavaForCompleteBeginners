package tutorial23_interfaces;

public class Interfaces {

    public static void main(String[] args) {

        Machine machine = new Machine();
        machine.start();
        machine.showInfo();
        Person person = new Person("George");
        person.greet();
        person.showInfo();

        Info info = new Machine();
        info.showInfo();
        Info info1 = new Person("Ashely");
        info1.showInfo();

        System.out.println();

        outputInfo(machine);
        outputInfo(person);
    }

    private static void outputInfo(Info info) {
        info.showInfo();
    }
}
