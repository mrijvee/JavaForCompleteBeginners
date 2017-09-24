package tutorial23_interfaces.interfacepractice;

public class Interface {

    public static void main(String[] args) {

        Info info = new Person();
        Info info1 = new Sayiyan();
        info.start();
        info1.start();
        info.stop();
        info.powerLevel();
        info1.powerLevel();
        info1.stop();
    }
}
