public class Animal {
    String name;
    String color;
    int age;
    public int maxRun;
    public int maxSwim;
    public int maxJump;


    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void run(float run) {
        System.out.println(name + " run " + run);
    }

    public void swim(float swim) {
        System.out.println(name + " swim " + swim);
    }

    public void jump(float jump) {
        System.out.println(name + " jump " + jump);
    }
}
