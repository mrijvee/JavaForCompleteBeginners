package tutorial18_staticandfinal;

class Anime {
    private static final String name = "Tsunade";
    private static final String name1 = "Jiraiya";
    private static final String name2 = "Orochimaru";
    private static int strengthPower;

    public static void setStrengthPower(String name, String name1, String name2) {
        if (name == "Tsunade") {
            strengthPower = 93;
            System.out.println("The strength power of Legendary Sannin, " + name + " is: " + strengthPower);
        }
        else if(name1 == "Jiraiya") {
            strengthPower = 98;
            System.out.println("The strength power of Legendary Sannin, " + name1 + " is: " + strengthPower);
        }
        else if(name2 == "Orochimaru") {
            strengthPower = 96;
            System.out.println("The strength power of Legendary Sannin, " + name2 + " is: " + strengthPower);
        }
    }
}

public class StaticAndFinal1 {

    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.setStrengthPower("sunade", "Jiraiya", "oro");
    }
}
