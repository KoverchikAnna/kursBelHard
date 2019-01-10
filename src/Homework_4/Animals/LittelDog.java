package Homework_4.Animals;

public class LittelDog extends Dog implements Cloneable {

    public LittelDog(String name, int age, String vote, boolean jump, boolean run, boolean bite) {
        super(name, age, vote, jump, run, bite);
    }

    @Override
    protected Object clone() {
        LittelDog littelDog = new LittelDog(name, age, vote, jump, run, bite);

        littelDog.setName(this.name);
        littelDog.setAge(this.age);
        littelDog.setVote(this.vote);
        littelDog.setJump(this.jump);
        littelDog.setRun(this.run);
        littelDog.setBite(this.bite);
        return littelDog;
    }

    @Override
    public int hashCode() {
        return (int) (31 * age + ((name == null) ? 0 : name.hashCode()) + ((vote == null) ? 0 : vote.hashCode()) +
                ((jump == false) ? 0 : 1) + ((run == false) ? 0 : 1) + ((bite == false) ? 0 : 1));
    }

    // @Override
    public void setName(String name) {
        this.name=name;
    }
}
