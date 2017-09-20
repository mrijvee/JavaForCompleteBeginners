package tutorial10_arrays;

public class Array {

    public static void main(String[] args) {
        int value = 7; //this is a value variable/type
        int[] values = new int[3]; //this is a reference variable/type
        System.out.println(values[0]);
        values[0] = 10;
        values[1] = 20;
        values[2] = 30;
        System.out.println("The value of 0 is: " + values[0]);
        System.out.println("The value of 1 is: " + values[1]);
        System.out.println("The value of 2 is: " + values[2]);
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        System.out.println("*********************");
        int[] number = {5, 6, 7};
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }
}
