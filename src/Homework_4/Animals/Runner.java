package Homework_4.Animals;

public class Runner {
    /*
Создать приложение, удовлетворяющее требованиям, приведенным в задании.
Наследование применять только в тех заданиях, в которых это логически обосновано.
Аргументировать принадлежность к классу каждого создоваемого метода и корректно переопределить для каждого класса методы
 equals(), hashCode(), toString().
 Создать объект класса Щенок, используя классы Животное, Собака.
 Методы: вывести на консоль имя, подать голос, прыгать, бегать, кусать.
 */
    public static void main(String[] args) {
        LittelDog littelDog = new LittelDog("Achi", 1, "rrr", true, true, true);
        littelDog.showName();
        littelDog.vote();
        littelDog.jump();
        littelDog.run();
        littelDog.bite();
        System.out.println(littelDog);

        LittelDog littelDog1 =(LittelDog) littelDog.clone();

        littelDog1.showName();

        System.out.println(littelDog.equals(littelDog1));
        System.out.println(littelDog);
        System.out.println(littelDog1);
        System.out.println(littelDog.hashCode());
        System.out.println(littelDog1.hashCode());
    }
}
