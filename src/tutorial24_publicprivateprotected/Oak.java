package tutorial24_publicprivateprotected;

public class Oak extends Plant {

    public Oak() {
        this.size = "Large"; //This works because size is protected and Oak is a subclass of Plant
        this.height = 10; //No access specifier - this works because Oak and Plant in same package
    }
}
