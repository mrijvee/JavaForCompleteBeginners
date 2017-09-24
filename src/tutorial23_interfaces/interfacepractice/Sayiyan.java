package tutorial23_interfaces.interfacepractice;

public class Sayiyan implements Info{

    int power = 9000;

    @Override
    public void start() {
        System.out.println("His super sayiyan form has begun");
    }

    @Override
    public int powerLevel() {
        power = 9000*2;
        if (power > 9000) {
            System.out.println("His power level has just multiplied");
        }
        return power*power;
    }

    @Override
    public void stop() {
        System.out.println("He's back to his normal form again");
    }
}
