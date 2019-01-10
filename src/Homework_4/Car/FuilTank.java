package Homework_4.Car;

public class FuilTank implements Filled {

    private final double MAX_VALUE = 40;
    private double currentValue = 0;

    @Override
    public void fill() {
        currentValue = MAX_VALUE;
    }

    @Override
    public double getFuel() {
        return currentValue--;
    }
}
