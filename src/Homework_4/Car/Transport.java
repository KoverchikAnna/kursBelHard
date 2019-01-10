package Homework_4.Car;

public abstract class Transport {
    protected Actionable[] moveParts;
    private Filled storage;

    protected void refill() {
        if (storage == null) {
            throw new RuntimeException("Отсутствует хранилище");
        }
        storage.fill();
    }

    public void addMoveParts(Actionable... part) {
        if (moveParts == null) {
            throw new RuntimeException("moveParts не должно быть null");
        }
        if (part.length != moveParts.length) {
            throw new RuntimeException("Неверное количество частей для движения");
        }
        for (int i = 0; i < moveParts.length; i++) {
            moveParts[i] = part[i];
        }
    }

    protected void changeMovePart(int numberPart, Actionable part) {
        moveParts[numberPart] = part;
    }

    protected void drive(){
        for (Actionable part : moveParts) {
            if (part == null) {
                throw new RuntimeException("Отсутсвуют части необходимые для движения");
            }
        }
        if (storage == null) {
            throw new RuntimeException("Отсутствует хранилище");
        }
        if (storage.getFuel() <= 0) {
            System.out.println("Закончилось топливо");
        }
        for (Actionable part: moveParts) {
            part.action();
        }
    }

    public Actionable[] getMoveParts() {
        return moveParts;
    }

    public void setMoveParts(Actionable[] moveParts) {
        this.moveParts = moveParts;
    }

    public Filled getStorage() {
        return storage;
    }

    public void setStorage(Filled storage) {
        this.storage = storage;
    }
}
