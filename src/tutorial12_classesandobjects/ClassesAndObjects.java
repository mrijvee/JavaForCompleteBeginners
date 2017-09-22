package tutorial12_classesandobjects;

class Person {
    String name;
    int age;
}

public class ClassesAndObjects {
    //Class is a blueprint for creating objects. It contains data and methods
    //Objects have states and behaviors. Ex: A dog has states - color, name, breed as well as behaviors
    public static void main(String[] args) {
        //Creating a person object using the Person class
        Person person = new Person();
        person.name = "Naruto";
        person.age = 17;
        Person person1 = new Person();
        person1.name = "Sasuke";
        person1.age = 17;
        System.out.println("name = " + person.name + " " + person.age);
    }
}