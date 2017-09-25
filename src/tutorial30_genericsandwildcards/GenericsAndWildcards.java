package tutorial30_genericsandwildcards;

import java.util.ArrayList;

class Machine { //If you have a class that doesn't extend anything, it implicitly extends Objects

    @Override
    public String toString() {
        return "I am a Machine";
    }

    public void start() {
        System.out.println("Machine starting");
    }
}

class Camera extends Machine {

    @Override
    public String toString() {
        return "I am a Camera";
    }

    public void snap() {
        System.out.println("snap!");
    }
}

public class GenericsAndWildcards {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        showList(list);

        ArrayList<Machine> machineList = new ArrayList<>();
        machineList.add(new Machine());
        machineList.add(new Machine());
        showMachineList(machineList);

        //An arrayList of Camera is not a subclass of an arrayList of Machine
        ArrayList<Camera> cameraList = new ArrayList<>();
        cameraList.add(new Camera());
        cameraList.add(new Camera());
        list(cameraList);

        System.out.println("**********");

        list1(cameraList);
        list1(machineList); //This also works since we're extending Machine in list1 method

        System.out.println("###########");

        list2(machineList);

        System.out.println("Break");

        list3(cameraList);
    }

    public static void showList(ArrayList<String> list) {
        for (String value: list) {
            System.out.println(value);
        }
    }

    public static void showMachineList(ArrayList<Machine> machineList) {
        for (Machine machine: machineList) {
            System.out.println(machine);
        }
    }

    public static void list(ArrayList<?> list) { // ? - It's a wildcard. We read this as an arrayList of unknown type
        for (Object value: list) { //Object is the ultimate parent of all classes in Java
            System.out.println(value); //Will print I am a Camera
            //Object has a toString method that allows sout to work
        }
    }

    //This is upperbound since it's extending. Lower bound uses super
    //Extends - this can a machine or a subtype of machine
    public static void list1(ArrayList<? extends Machine> list) {
        for (Machine value: list) { //Since we're extending Machine, we can now use Machine.
            // In the previous method of list, we weren't able to use Machine since we didn't extend. Therefore, we used Object
            System.out.println(value);
            value.start();
        }
    }

    //This is lowerbound which uses super
    //Super - this can be a Camera or a super type of camera
    public static void list2(ArrayList<? super Camera> list) {
        for (Object value: list) { //We have to use Object because of super. Machine or Camera would not work in this case
            System.out.println(value);
        }
    }

    public static void list3(ArrayList<? extends Camera> list) {
        for (Camera value: list) {
            System.out.println(value);
            value.snap();
        }
    }
}
