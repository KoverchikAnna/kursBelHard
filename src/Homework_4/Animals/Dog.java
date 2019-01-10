package Homework_4.Animals;

public class Dog extends Animals implements Cloneable {
    String vote;
    String name;
    boolean jump;
    boolean run;
    boolean bite;

    public Dog(String name, int age, String vote, boolean jump, boolean run, boolean bite) {
        super(name, age, vote);
        this.jump = jump;
        this.run = run;
        this.bite = bite;
    }

    public void jump() {
        if (this.jump == true) {
            System.out.println("Прыгает! ");
        } else {
            System.out.println("Не умеет прыгать!");
        }
    }

    public void run() {
        if (this.run == true) {
            System.out.println("Бежит! ");
        } else {
            System.out.println("Не умеет бегать!");
        }
    }

    public void bite() {
        if (this.bite == true) {
            System.out.println("Кусает! ");
        } else {
            System.out.println("Не умеет кусать!");
        }
    }

    @Override
    public int hashCode() {
        return (int) (31 * age + ((name == null) ? 0 : name.hashCode()) + ((vote == null) ? 0 : vote.hashCode()) +
                ((jump == false) ? 0 : 1) + ((run == false) ? 0 : 1) + ((bite == false) ? 0 : 1));
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }
        Dog other = (Dog) object;
        if (age != other.age) {
            return false;
        }
        if (vote != other.vote) {
            return false;
        }
        if (jump != other.jump) {
            return false;
        }
        if (run != other.run) {
            return false;
        }
        if (bite != other.bite) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return getClass().getName() + "@name " + getName() + " age " + age + " vote " + getVote() + " jamp " + jump + " run " + run + " bite " + bite;
    }

    @Override
    protected Object clone() {
        Dog dog = new Dog(name, age, vote, jump, run, bite);
        dog.setName(this.name);
        dog.setAge(this.age);
        dog.setVote(this.vote);
        dog.setJump(this.jump);
        dog.setRun(this.run);
        dog.setBite(this.bite);
        return dog;
    }

    public boolean isBite() {
        return bite;
    }

    public void setBite(boolean bite) {
        this.bite = bite;
    }

    public boolean isJump() {
        return jump;
    }

    public void setJump(boolean jump) {
        this.jump = jump;
    }

    public boolean isRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }
}

