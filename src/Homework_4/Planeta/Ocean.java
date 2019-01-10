package Homework_4.Planeta;

public class Ocean implements Cloneable {
    public String nameOcean;
    private int id;

    public Ocean(int id, String nameOcean) {
        this.nameOcean = nameOcean;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOcean() {
        return nameOcean;
    }

    public void setNameOcean(String nameOcean) {
        this.nameOcean = nameOcean;
    }

    @Override
    public Object clone() {
        Ocean ocean = new Ocean(id, nameOcean);
        ocean.setId(this.id);
        ocean.setNameOcean(this.nameOcean);
        return ocean;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Ocean other = (Ocean) obj;
        if (id != other.id)
            return false;
        if (nameOcean == null) {
            if (other.nameOcean != null)
                return false;
        } else if (!nameOcean.equals(other.nameOcean))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return getClass().getName() + "@nameOcean " + nameOcean + " id: " + id;
    }

    @Override
    public int hashCode() {
        return (int) (id * 31 + ((nameOcean == null) ? 0 : nameOcean.hashCode()));
    }
}
