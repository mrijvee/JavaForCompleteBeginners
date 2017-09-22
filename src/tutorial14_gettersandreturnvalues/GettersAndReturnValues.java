package tutorial14_gettersandreturnvalues;

class Person {
    String name;
    int age;

    void speak() {
        System.out.println("My name is " + name + ", and my age is " + age);
    }
    int calculateYearsToRetirement() {
        int yearsLeft = 103 - age;
        return yearsLeft;
    }
    //get method
    int getAge() {
        return age;
    }
    String getName() {
        return name;
    }
}

public class GettersAndReturnValues {

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Itachi";
        person.age = 21;
        person.speak();
        int years = person.calculateYearsToRetirement();
        System.out.println("Years left to live is: " + years);
        int age = person.getAge();
        System.out.println(age);
        String name = person.getName();
        System.out.println(name);
    }
}
