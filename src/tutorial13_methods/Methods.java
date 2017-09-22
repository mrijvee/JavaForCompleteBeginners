package tutorial13_methods;

class Person {
    String name;
    int age;
    void speak() {
        System.out.println("Hello");
        System.out.println("My name is " + name + ", and my age is " + age);
    }
    void hello() {
        System.out.println("Hello there mate!");
    }
}

public class Methods {
    //Methods - a collection of statements that are grouped together to perform an operation.
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Naruto";
        person.age = 17;
        person.speak();
        Person person1 = new Person();
        person1.name = "Sasuke";
        person1.age = 17;
        person1.speak();
        System.out.println("My name is " + person.name + ", and my age is " + person.age);
        person1.hello();
    }
}