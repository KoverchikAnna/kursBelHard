package Homework_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Runner_3_6_1 {
    //Имеется строка с текстом. Подсчитать количество слов в тексте.
    // Желательно учесть, что слова разделяются несколькими пробелами,
    // в начале и в конце текста так же могут быть пробелы, но могуть отсутствавать.
    public static void main(String[] args) throws IOException {
        System.out.println("Введите строку символов. ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        bufferedReader.close();
        Pattern pattern = Pattern.compile("\\s");
        String[] strings = pattern.split(str);
        int j = 0;
        for (String s : strings) {
            if (s == pattern.pattern()) {
                j++;
            }
        }
        System.out.println("количество слов: "+ (strings.length-j));
    }
}