package tutorial23_interfaces.interfacepractice;

import java.util.Scanner;

public class Person implements Info {

    String human;
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void start() {
        System.out.println("Please enter the saiyan's name");
        human = scanner.nextLine();
        System.out.println(human + " is his name");
    }

    @Override
    public void stop() {
        System.out.println(human + "'s power level has diminished");
    }

    @Override
    public int powerLevel() {
        System.out.println("His power level has gone down to zero");
        return 0;
    }
}
