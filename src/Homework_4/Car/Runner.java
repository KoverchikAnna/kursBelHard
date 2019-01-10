package Homework_4.Car;

public class Runner {
    public static void main(String[] args) {


        Car car = new Car("Lada");
        Wheel wheel1 = new Wheel("Снежинка", 14);
        Wheel wheel2 = new Wheel("Снежинка", 14);
        Wheel wheel3 = new Wheel("Снежинка", 14);
        Wheel wheel4 = new Wheel("Снежинка", 14);

        car.addMoveParts(wheel1, wheel2, wheel3, wheel4);
        car.showBrand();
        car.changeMovePart(1, new Wheel("Кама", 14));
    }
}

