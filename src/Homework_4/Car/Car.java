package Homework_4.Car;

public class Car extends Transport {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
        super.moveParts = new Actionable[4];
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Автомобиль начал движение");
    }

    public void showBrand() {
        System.out.println(brand);
    }
}

