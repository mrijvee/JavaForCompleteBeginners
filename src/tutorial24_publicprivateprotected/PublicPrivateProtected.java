package tutorial24_publicprivateprotected;

public class PublicPrivateProtected {

    //public - from anywhere
    //private - only within same class
    //protected - from same class, subclass, and same package
    //no modifier - from same package only. No modifier means it doesn't have private, public, or protected. Ex: int x;

    public static void main(String[] args) {
        Plant plant = new Plant();
        System.out.println(plant.name);
        System.out.println(plant.id);
        System.out.println(plant.size);

    }
}
