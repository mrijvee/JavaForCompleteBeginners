package tutorial23_interfaces;

public class Person implements Info { //Class can only extend one parent class but can implement as many interfaces needed separated by commas

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println("Hello there");
    }

    @Override
    public void showInfo() {
        System.out.println("Person name is: " + name);
    }
}
