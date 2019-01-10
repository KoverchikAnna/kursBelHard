package Homework_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner_3_6 {
    //Имеется строка с текстом. Подсчитать количество слов в тексте.
    // Желательно учесть, что слова разделяются несколькими пробелами,
    // в начале и в конце текста так же могут быть пробелы, но могуть отсутствавать.

    public static void main(String[] args) throws IOException {

        System.out.println("Введите строку символов.");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        bufferedReader.close();
        String[] masWord = str.split(" ");
        int k = 0;
        for (int i = 0; i < masWord.length; i++) {
            if (!("".equals(masWord[i]))) {
                k++;
            }
        }
        System.out.println("Количество слов в тексте равно " + k);
    }
}
