package Homework_4.Planeta;

public class Planeta implements Cloneable {

    public String namePlaneta;
    private int id;
    public Continent[] continent;
    public Island[] islands;
    public Ocean[] oceans;


    public Planeta(int id, String namePlaneta) {
        this.namePlaneta = namePlaneta;
        this.id = id;
    }

    public void showPlanet() {
        System.out.println(getNamePlaneta());
    }

    public void printPlanetaIsContinents(Continent[] continent) {
        for (int i = 0; i < continent.length; i++) {
            System.out.println(continent[i].getNameContinent());
        }
    }

    public void printPlanetaIsIsland(Island[] islands) {
        for (int i = 0; i < islands.length; i++) {
            System.out.println(islands[i].getNameIsland());
        }
    }

    public void printPlanetaIsOcean(Ocean[]ocean) {
        for (int i = 0; i < ocean.length; i++) {
            System.out.println(ocean[i].getNameOcean());
        }
    }

    public int quantityContinentIsIslands(Island[] islands) {
        return islands.length;
    }

    public int quantityContinentIsPlaneta(Continent[] continent) {
        return continent.length;
    }

    public int quantityOceanIsPlaneta(Ocean[]ocean) {
        return ocean.length;
    }

    public void showQuantityIslandsIsPlaneta(Island[] islands) {
        System.out.println(quantityContinentIsIslands(islands));
    }

    public void showQuantityContinentIsPlaneta(Continent[] continent) {
        System.out.println(quantityContinentIsPlaneta(continent));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamePlaneta() {
        return namePlaneta;
    }

    public void setNamePlaneta(String namePlaneta) {
        this.namePlaneta = namePlaneta;
    }

    @Override
    public int hashCode() {
        return (int) (id * 31 + ((namePlaneta == null) ? 0 : namePlaneta.hashCode()));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Planeta other = (Planeta) obj;
        if (id != other.id)
            return false;
        if (namePlaneta == null) {
            if (other.namePlaneta != null)
                return false;
        } else if (!namePlaneta.equals(other.namePlaneta))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return getClass().getName() + "@namePlaneta " + namePlaneta + " id: " + id;
    }

    @Override
    protected Object clone() {
        Planeta planeta = new Planeta(id, namePlaneta);
        planeta.setId(this.id);
        planeta.setNamePlaneta(this.namePlaneta);
        return planeta;
    }
}
