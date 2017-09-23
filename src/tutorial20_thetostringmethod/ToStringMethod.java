package tutorial20_thetostringmethod;

class Frog {

    private int id;
    private String name;

    public Frog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() { //Purpose of toString - you can create a string representation of your object
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(id).append(": ").append(name); //Efficient
//        return id + ": " + name; //Inefficient -- Concurrent string is quite inefficient. Better to use StringBuilder
        return stringBuilder.toString();
        //return String.format("%4d: %s", id, name); //%s ---> to output the name;
    }
}

public class ToStringMethod {

    public static void main(String[] args) {
        Frog frog = new Frog(7, "Raikage");
        Frog frog1 = new Frog(5, "Minato");
        System.out.println(frog);
        System.out.println(frog1);

    }
}
