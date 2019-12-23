public class Bird extends Animal {

    float maxRun = 5;
    float maxSwim = 0;
    float maxJump = 0.2f;
    String nameClass = "Bird";

    public Bird(String name, String color, int age) {
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
        System.out.println(nameClass + " can't swim");
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
