package Homework_3;

import java.util.Random;

public class Runner_3_7 {
    //Написать два цикла выполняющих многократное сложение строк (любых),
    //один - с помощью String, второй - с помощью StringBuilder.
    //Сравните скорость выполнения (сравнить затраченное количество милисекунд).
    public static void main(String[] args) {
        System.out.println("Введите строку символов.");
        String[] masStr = new String[100];
        Random random = new Random();
        for (int i = 0; i <= 99; i++) {
            masStr[i] = random.toString();
        }
    }
}
