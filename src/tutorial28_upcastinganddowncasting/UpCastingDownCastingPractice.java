package tutorial28_upcastinganddowncasting;

class Anime {

    public void anime() {
        System.out.println("Anime is very fun to watch");
    }
}

class Naruto extends Anime {

    @Override
    public void anime() {
        System.out.println("Naruto is very fun to watch");
    }

    public void naruto() {
        System.out.println("Everyone should give Naruto a try");
    }
}

public class UpCastingDownCastingPractice {

    public static void main(String[] args) {

        Anime anime = new Anime();
        Naruto naruto = new Naruto();

        //Upcasting
        Anime anime1 = naruto;
        anime1.anime();

        Anime anime2 = new Naruto();
        //Downcasting
        Naruto naruto1 = (Naruto) anime2;
        naruto1.naruto();
        //Alternate way to downcast
        ((Naruto) anime2).naruto();
    }
}
