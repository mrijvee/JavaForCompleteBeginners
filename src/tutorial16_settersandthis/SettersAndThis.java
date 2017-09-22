package tutorial16_settersandthis;

class Frog {

    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setInfo(String name, int age) {
        setName(name); //here, we don't need to put this.
        setAge(age);
    }

    public String getInfo() {
        return name + age;
    }
}
    public class SettersAndThis {

    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.getName();
        frog.getAge();
        frog.setName("Bertie");
        frog.setAge(18);
        System.out.println(frog.getName());
        System.out.println(frog.getAge());
        frog.setInfo("Shinchi ", 19);
        System.out.println(frog.getInfo());
    }
}
