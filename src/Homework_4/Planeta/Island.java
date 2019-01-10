package Homework_4.Planeta;

public class Island implements Cloneable {
    public String nameIsland;
    private int id;

    public Island(int id, String nameIsland) {
        this.nameIsland = nameIsland;
        this.id = id;
    }

    public String getNameIsland() {
        return nameIsland;
    }

    public void setNameIsland(String nameIsland) {
        this.nameIsland = nameIsland;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Island other = (Island) obj;
        if (id != other.id)
            return false;
        if (nameIsland == null) {
            if (other.nameIsland != null)
                return false;
        } else if (!nameIsland.equals(other.nameIsland))
            return false;
        return true;
    }

    @Override
    public Object clone() {
        Island island = new Island(id, nameIsland);
        island.setId(this.id);
        island.setNameIsland(this.nameIsland);
        return island;
    }

    @Override
    public String toString() {
        return getClass().getName() + "@nameIsland " + nameIsland + " id: " + id;
    }

    @Override
    public int hashCode() {
        return (int) (id * 31 + ((nameIsland == null) ? 0 : nameIsland.hashCode()));
    }
}
