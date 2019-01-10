package Homework_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner_3_5_1 {
// Найти в произвольной строке не только запятые, но и все знаки препинания.
//Посчитать их общее количество.(Не обязательно - посчитать сколько каких знаков).

  public static void main(String []args){
    String text = "Егор Алла   Александр < ,Анна?  ";
    Pattern pattern=Pattern.compile("\\W");
    String [] strings=pattern.split(text);
    for (String s:strings){
      System.out.println(s);
    //Matcher matcher=pattern.matcher(text);
    //while (matcher.find()) {
    //System.out.println(text.substring(matcher.start(),matcher.end()));
    }
    System.out.println("________");
    String[] strings1=pattern.split(text);
    for (String s:strings1){
      System.out.println(s);
    }

    }
}
