package Homework_4.Planeta;

public class Continent implements Cloneable {
    public String nameContinent;
    private int id;

    public Continent(int id, String nameContinent) {
        this.nameContinent = nameContinent;
        this.id = id;
    }

    public String getNameContinent() {
        return nameContinent;
    }

    public void setNameContinent(String nameContinent) {
        this.nameContinent = nameContinent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public Object clone() {
        Continent continent = new Continent(id, nameContinent);
        continent.setNameContinent(this.nameContinent);
        // continent.setId(this.id);
        return continent;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Continent other = (Continent) obj;
        if (id != other.id)
            return false;
        if (nameContinent == null) {
            if (other.nameContinent != null)
                return false;
        } else if (!nameContinent.equals(other.nameContinent))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return getClass().getName() + "@nameContinent " + nameContinent + " id: " + id;
    }

    @Override
    public int hashCode() {
        return (int) (id * 31 + ((nameContinent == null) ? 0 : nameContinent.hashCode()));
    }
}