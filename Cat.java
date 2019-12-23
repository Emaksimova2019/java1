public class Cat extends Animal {

    float maxRun = 200;
    float maxSwim = 0;
    float maxJump = 2f;
    String nameClass = "Cat";

    public Cat(String name, String color, int age) {
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
