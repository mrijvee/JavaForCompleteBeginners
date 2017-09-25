package tutorial26_encapsulationandapidocs;

class Plant {
    private String name;
    public static final int ID = 7;

    public String getData() {
        String data = "some stuff" + calculateGrowthForecast();
        return data;
    }

    private int calculateGrowthForecast() {
        return 9;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
//Encapsulation - The idea of it is that you encapusulate the inner working of that class. You stop people outside the class from getting into that class.
/*You kinda expose any kind of public API. So in order to use the "private String name" from outside the class Plant,
we would have to use getters and setters which will be public.*/
/*Therefore, encapsulation enables us to use the public method getName, and setName without having to worry
about its inner workings of class being changed. For ex: private String name <-- inner workings of the class Plant*/
//We should always try to keep data private. If we do make it public, we should then make it final as shown above: public static final int ID = 7;
//So, all in all, Encapsulation is hiding implementation details within the class which prevents classes being tightly coupled
//Two classes are tightly coupled when they're calling each other all the time and to prevent that, we use Encapsulation

public class Encapsulation {

    public static void main(String[] args) {
        Plant plant = new Plant();
        System.out.println(plant.getData());
        plant.setName("Ashely");
        System.out.println(plant.getName());
    }
}
