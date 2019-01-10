package Homework_2;

public class Runner_2_1 {
    //1. Посчитать факториал числа в границах от 10 до 15 (не используя рекурсии).
    public static void main(String[] args) {
        int fact=1;
        for (int i=10 ; i<16;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
