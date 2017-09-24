package tutorial25_polymorphism;

public class Polymorphism {

    //Polymorphism - If you have a child class, you can always use a child class anywhere where you normally use a parent class

    public static void main(String[] args) {

        Plant plant = new Plant();
        Tree tree = new Tree();
        Plant plant1 = tree; //This is basically polymorphism in action based on the def provided above
        plant1.grow(); //This will print Tree growing since plant1 is pointing to the object (tree)
        tree.shedLeaves();
//      plant1.shedLeaves(); //This won't work since shedLeaves wasn't overriden by its parent class Plant
        doGrow(tree); //This works because polymorphism guarantees me that wherever a parent class is expected, I can use a child class
    }

    public static void doGrow(Plant plant) {
        plant.grow();
    }
}
