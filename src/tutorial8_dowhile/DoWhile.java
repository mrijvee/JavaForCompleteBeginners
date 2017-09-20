package tutorial8_dowhile;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        do {
        System.out.println("Enter a number: ");
        num = scanner.nextInt();
        }
        while (num != 5);
        System.out.println("Found number 5");
    }
}