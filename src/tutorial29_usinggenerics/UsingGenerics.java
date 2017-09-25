package tutorial29_usinggenerics;

import java.util.ArrayList;
import java.util.HashMap;

class Animal {

}

public class UsingGenerics {

    /* Generic - A generic class is a class that can work with other objects and you specify
    what type of objects it can work with when you instantiate a class, and/or when you create objects from the class */

    //ArrayList - manages an Array internally. It's like having an Array but you don't have to worry about the size of the Array

    public static void main(String[] args) {

        /////////Before Java 5////////////
        ArrayList list = new ArrayList();
        list.add("cherries");
        list.add("bananas");
        list.add("mangoes");
        System.out.println(list.get(2));

        ////////Modern style////////
        ArrayList<String> strings = new ArrayList<>();
        strings.add("cat");
        strings.add("mouse");
        strings.add("dog");
        System.out.println(strings.get(1));

        //////////There can be more than one type argument///////////
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>(); //HashMap can take 2 type arguments. In this case: String & Integer

        //////////Java 7 style/////////////
        ArrayList<Animal> animals = new ArrayList<>();
    }
}
