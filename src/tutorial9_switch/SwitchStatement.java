package tutorial9_switch;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a command: ");
        String text = scanner.nextLine();

        switch (text) {
            case "start":
                System.out.println("Sayiyan started");
                break;
            case "stop":
                System.out.println("Sayiyan stopped");
                break;
            default:
                System.out.println("Command not found");
                break;
        }
    }
}
