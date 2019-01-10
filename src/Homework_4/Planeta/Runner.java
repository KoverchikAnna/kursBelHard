package Homework_4.Planeta;
/*
Создать приложение, удовлетворяющее требованиям, приведенным в задании.
Наследование применять только в тех заданиях, в которых это логически обосновано.
Аргументировать принадлежность к классу каждого создоваемого метода и корректно переопределить для каждого класса методы
 equals(), hashCode(), toString().
 Создать объект класса Планета, используя классы Материк, Океан, Остров.
 Методы: вывести название материка, планеты, количество материков
 */
public class Runner {
    public static void main(String[] args) {
        Planeta planeta = new Planeta(32, "Земля");
        /*   Planeta planeta1 = new Planeta(32, "Земля");
        Planeta planeta2 = new Planeta(28, "Марс");

        Object p = (Planeta) planeta.clone();
        System.out.println(planeta.getNamePlaneta() + "    " + planeta.hashCode());
        System.out.println(planeta1.getNamePlaneta() + "    " + planeta1.hashCode());
        System.out.println(planeta2.getNamePlaneta() + "    " + planeta2.hashCode());
        System.out.println(planeta.equals(planeta1) + "   " + planeta1.equals(planeta2) + "   " + planeta1.equals(planeta));
        System.out.println(planeta);
        System.out.println(p);
        System.out.println(planeta.equals(p));

        Ocean ocean = new Ocean(12, "Atlantic");
        Ocean ocean1 = new Ocean(12, "Atlantic");
        Ocean ocean2 = new Ocean(12, "Indian");
        Object o = (Ocean) ocean.clone();
        System.out.println(ocean.equals(ocean1));
        System.out.println(ocean.equals(ocean2));
        System.out.println(ocean1.equals(ocean));
        System.out.println(o.equals(ocean1));
        System.out.println(o);
        System.out.println(ocean);
        System.out.println(ocean1);
        System.out.println(ocean2);

        System.out.println(o.hashCode());
        System.out.println(ocean.hashCode());
        System.out.println(ocean1.hashCode());
        System.out.println(ocean2.hashCode());
*/
        Continent continent1 = new Continent(1, "Австралия");
        Continent continent2 = new Continent(2, "Европа");
        Continent continent3 = new Continent(3, "Азия");
        Continent continent4 = new Continent(4, "Африка");
        Continent continent5 = new Continent(5, "Северная Америка");
        Continent continent6 = new Continent(6, "Южная Америка");
        Continent continent7 = new Continent(7, "Антарктида");

        Continent continent[] = {continent1, continent2, continent3, continent4, continent5, continent6, continent7};
        planeta.showPlanet();
        planeta.showQuantityContinentIsPlaneta(continent);
        planeta.printPlanetaIsContinents(continent);

    }
}
