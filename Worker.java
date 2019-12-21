package ru.geekbrains.java_one.lesson_d.online;

public class Worker {
    private String nameFio;
    private String position;
    private String foneNumber;
    private float zarPlata;
    private int age;

    public Worker(String nameFio, String position, String foneNumber, float zarPlata, int age) {
        this.nameFio = nameFio;
        this.position = position;
        this.foneNumber = foneNumber;
        this.zarPlata = zarPlata;
        this.age = age;
    }

    public String getNameFio() {
        return nameFio;
    }

    public void setNameFio(String nameFio) {
        this.nameFio = nameFio;
    }

    public String getPosition() {
        return position;
    }

    public String getFoneNumber() {
        return foneNumber;
    }

    public float getZarPlata() {
        return zarPlata;
    }

    public void setZarPlata(float zarPlata) {
        this.zarPlata = zarPlata;
    }

    public int getAge() {
        return age;
    }


}

