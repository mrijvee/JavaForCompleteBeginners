package tutorial28_upcastinganddowncasting;

class Machine {

    public void start() {
        System.out.println("Machine started.");
    }
}

class Camera extends Machine {

    @Override
    public void start() {
        System.out.println("Camera started");
    }

    public void snap() {
        System.out.println("Photo taken.");
    }
}

public class UpCastingAndDownCasting {

    public static void main(String[] args) {

        Machine machine = new Machine();
        Camera camera = new Camera();
        machine.start();
        camera.start();
        camera.snap();
        //Upcasting --> safe because it's guaranteed by polymorphism
        Machine machine1 = camera; //This is upcasting since camera is up the hierarchy
        machine1.start(); //Will print camera started
        /* machine1.snap(); --> Won't work because it's the actual variable that decides what methods to call
        and the variable machine1 is a type machine which only has a start() method */

        //Downcasting
        Machine machine2 = new Camera();
        Camera camera1 = (Camera)machine2; //This is how you downcast and the reason java wants confirmation of (Camera)
        // is because downcasting is unsafe unlike upcasting
        camera1.start();
        camera1.snap(); //Now, it can print the snap() method since we downcasted

        //We can't do this because we can't just change the Machine object to Camera
        //It would cause a runtime error
        Machine machine3 = new Machine();
//        Camera camera2 = (Camera) machine3;
//        camera2.start();
        //When using downcasting, we have be sure that the object variable that we're casting really does refer
        // to the object that we're trying to downcast
    }
}
