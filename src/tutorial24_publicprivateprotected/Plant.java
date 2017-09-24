package tutorial24_publicprivateprotected;

public class Plant {
    //Bad practice
    public String name;

    //Good practice ... it's final
    public final static int id = 8;

    private String type;

    protected String size; //The child class(Oak) also has access to this. Protected however doesn't work with different packages like public
    //So if Plant was in a different package, it won't work in the PublicPrivateProtected class. But would work if it was public

    int height;

    public Plant() {
        this.name = "Freddie";
        this.type = "Plant";
        this.size = "Medium";
        this.height = 8;
    }
}
