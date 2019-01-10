package Homework_4.Animals;

public class Animals implements Vote, Cloneable {
    String vote;
    String name;
    int age;

    public Animals(String name, int age, String vote) {
        this.name = name;
        this.age = age;
        this.vote = vote;
    }

    public void showName() {
        System.out.println(this.getName());
    }

    public void voteAnimal(String vote) {
        System.out.println(vote);
    }

    @Override
    public void vote() {
        System.out.println(getVote());
    }

    @Override
    public String getVote() {
        return vote;
    }

    @Override
    public int hashCode() {
        return (int) (31 * age + ((name == null) ? 0 : name.hashCode()) + ((vote == null) ? 0 : vote.hashCode()));
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
        Animals other = (Animals) object;
        if (age != other.age) {
            return false;
        }
        if (vote != other.vote) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            } else if (!name.equals(other.name)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return getClass().getName()+"@name "+getName()+" age "+age+" vote "+getVote();
    }

    @Override
    protected Object clone() {
        Animals animal = new Animals(name,age,vote);
        animal.setName(this.name);
        animal.setAge(this.age);
        animal.setVote(this.vote);
        return animal;
    }

    public void setVote (String vote){
        this.vote = vote;
    }

    public String getName () {
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public void setAge ( int age){
        this.age = age;
    }
}


