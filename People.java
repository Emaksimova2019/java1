package ru.geekbrains.java_one.lesson_d.online;

public class People {

    public static void increaseZarPlata(Worker[] workers) {
        for(int i = 0; i < workers.length; i++) {
            if(workers[i].getAge() > 45) {
                workers[i].setZarPlata(workers[i].getZarPlata() + 5000);
            }
        }
    }

    public static void printWorkers(Worker[] workers) {
        for(int i = 0; i < workers.length; i++) {
            System.out.println(workers[i].getNameFio() + ", " + workers[i].getPosition() + ", " + workers[i].getZarPlata());
        }
    }

    public static void main(String[] arg) {

        Worker w0 = new Worker("Иванов И.И.", "специалист", "+79210003423", 25000, 26);
        System.out.println(w0.getNameFio() + ", " + w0.getPosition());

        Worker[] workers = new Worker[5];
        workers[0] = new Worker("Иванов И.И.", "специалист", "+79210003423", 25000, 30);
        workers[1] = new Worker("Петров П.П.", "ведущий специалист", "+79210016754", 35000, 50);
        workers[2] = new Worker("Иванова М.И.", "бухгалтер", "+79210003424", 37500, 46);
        workers[3] = new Worker("Ивашкин К.К.", "менеджер", "+79210003425", 27000, 41);
        workers[4] = new Worker("Смирнов И.И.", "специалист", "+79210003426", 23000, 26);

        for(int i = 0; i < workers.length; i++) {
            if(workers[i].getAge() > 40) {
                System.out.println(workers[i].getNameFio() + ", " + workers[i].getPosition());
            }
        }

        printWorkers(workers);
        increaseZarPlata(workers);
        printWorkers(workers);
    }
}
