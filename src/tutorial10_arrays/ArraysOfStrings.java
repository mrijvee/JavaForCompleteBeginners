package tutorial10_arrays;

public class ArraysOfStrings {
    public static void main(String[] args) {
        String[] words = new String[3];
        words[0] = "Hello";
        words[1] = " to";
        words[2] = " you";
        System.out.println(words[0] + words[1] + words[2]);

        String[] fruits = {"Kiwi", "Banana", "Cherry", "Mango"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Your favorite fruits consist of the following: " + fruits[i]);
        }
        for (String fruit: fruits) { //This is enhanced forloop and will print the same result as the forloop above
            System.out.println(fruit);
        }
    }
}
