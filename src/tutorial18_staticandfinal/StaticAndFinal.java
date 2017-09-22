package tutorial18_staticandfinal;

class Thing {
    public final static int LUCKY_NUMBER = 7; //Won't be able to reassign since final
    public static int count = 0;
    int id;

    public Thing() {
        id = count; //This will keep a track of what count was
        count++; //Since count is static, it belongs to the class and not to the object
    }

    public String name;
    public static String description; //Usually when we have member variables, we make it private. Just keeping it public for this tutorial

    public void showName() { //the instance method can however access static data
        System.out.println("Object id: " + id + ", " + description + ": " + name);
    }

    public static void showInfo() {
        System.out.println(description);
//      System.out.println(name); //this wouldn't work because we can't make a static reference to a non-static field
    }
}
public class StaticAndFinal {
    public static void main(String[] args) {
        System.out.println("Before creating objects, count is: " + Thing.count);
        Thing thing = new Thing();
        System.out.println("After creating an object, count is: " + Thing.count);
        Thing thing1 = new Thing();
        System.out.println("After creating another object, count is: " + Thing.count);
        thing.name = "Kakashi";
        thing1.name = "Jiraiya";
        thing.description = "The sage master";
        System.out.println(thing.description);
        System.out.println(thing.name);
        System.out.println(thing1.name);
        thing1.showName();
        thing.showName();
        thing.showInfo();

        System.out.println(Math.PI); //Since PI is constant, we can't reassign it. We wanna do the same for LUCKY_NUMBER
        System.out.println(Thing.LUCKY_NUMBER); //We'll create our own static Lucky_Number just like PI
    }
}
