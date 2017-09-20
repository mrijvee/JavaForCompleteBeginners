package tutorial7_gettinguserinput;

import java.util.Scanner;

public class GettingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a floating point value");
        float floatValue = scanner.nextFloat();
        System.out.println("Enter a double value");
        double doubleValue = scanner.nextDouble();
        System.out.println("Your floating point value is: " + floatValue);
        System.out.println("Your double value is: " + doubleValue);

    }
}
