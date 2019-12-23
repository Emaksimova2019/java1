public class Horse extends Animal {

    float maxRun = 1500;
    float maxSwim = 100;
    float maxJump = 3f;
    String nameClass = "Horse";

    public Horse(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void run(float run) {
        if(run > maxRun) {
            System.out.println(nameClass + " can't run anymore than " + maxRun);
        } else {
            System.out.println(name + " run " + run);
        }
    }

    @Override
    public void swim(float swim) {
        if(swim > maxSwim) {
            System.out.println(nameClass + " can't swim anymore than " + maxSwim);
        } else {
            System.out.println(name + " swim " + swim);
        }
    }

    @Override
    public void jump(float jump) {
        if(jump > maxJump) {
            System.out.println(nameClass + " can't jump anymore than " + maxJump);
        } else {
            System.out.println(name + " jump " + jump);
        }
    }
}
