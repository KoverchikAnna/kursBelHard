package Homework_3;
import java.util.Scanner;

public class Runner_3_3 {
//1.Ввести с помощью консоли произвольное количество символов (любых). Сложить все
//введенные числа, а все введенные буквы сконкатенировать в одну строку (использовать
//StringBuilder).
//Ввести с помощью консоли произвольное количество символов (любых).
//Сложить введенные буквы в одну строку (использовать StringBuilder).
    public static void main(String[] args) {
        System.out.println("Введите строку символов. ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        scanner.close();
        StringBuilder stringBuilder = new StringBuilder(str);

        int sum = 0;
        int i = 0;
        while (i < stringBuilder.length()) {
            if ((stringBuilder.charAt(i) == '0') || (stringBuilder.charAt(i) == '1') || (stringBuilder.charAt(i) == '2') ||
                    (stringBuilder.charAt(i) == '3') || (stringBuilder.charAt(i) == '4') || (stringBuilder.charAt(i) == '5') ||
                    (stringBuilder.charAt(i) == '6') || (stringBuilder.charAt(i) == '7') || (stringBuilder.charAt(i) == '8') ||
                    (stringBuilder.charAt(i) == '9')) {
                sum = sum + Character.getNumericValue(stringBuilder.charAt(i));
                stringBuilder.deleteCharAt(i);
            } else {
                i++;
            }
        }
        System.out.println("Сумма цифр равна " + sum);
        System.out.println("После удаления цифр получили стрроку: " + stringBuilder);
    }
}
