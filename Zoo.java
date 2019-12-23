import java.util.Scanner;

public class Zoo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Animal[] animals = new Animal[4];
        animals[0] = new Cat("Barsik", "grey", 3);
        animals[1] = new Dog("Jim", "red", 12);
        animals[2] = new Horse("Savrasks", "black", 5);
        animals[3] = new Bird("Kesha", "white", 1);

        for(int i = 0; i < animals.length; i++) {
            System.out.println("---------------------------------------");
            System.out.println("Insert number:");
            float userNumber = scanner.nextFloat();
            animals[i].run(userNumber);
            animals[i].swim(userNumber);
            animals[i].jump(userNumber);
        }
        System.out.println("---------------------------------------");
    }
}
