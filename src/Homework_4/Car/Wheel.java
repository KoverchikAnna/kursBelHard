package Homework_4.Car;

public class Wheel implements Actionable {

    private String name;
    private int radius;

    public Wheel(String name, int radius) {
        this.name = name;
        this.radius = radius;
    }


    @Override
    public void action() {
        System.out.println("Колесо вращается");
    }
}