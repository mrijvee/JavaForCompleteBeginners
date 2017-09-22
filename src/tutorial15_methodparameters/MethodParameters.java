package tutorial15_methodparameters;

class Robot {

    public void speak(String text) {
        System.out.println(text);
    }
    public void jump(int height) {
        System.out.println("Jumping " + height);
    }
    public void move(double distance, String direction) {
        System.out.println("moving " + distance + " meters in direction " + direction);
    }
}

public class MethodParameters {

    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.speak("Hi there");
        robot.jump(33);
        robot.move(33.4, "right");
        String greeting = "Hello there";
        robot.speak(greeting);
        int value = 14;
        robot.jump(value);
    }
}
