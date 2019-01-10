package Homework_5.Student;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class StudentService {
    /*
Создать классы, спецификации которых приведены ниже.
Определить конструкторы и методв setТип(), getТип(), toString()
Определить дополнительно методы в классе, создающем массив объектов.
Задать критерий выбора данных и вывести эти данные на консоль.
В каждом классе, обладающем информацией, должно быть объявленно несколько конструкторов.
1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет,Курс, Группа.
Создать массив объектов. Вывести:
а) список студентов заданного факультета.
б) список студентов для каждого факультеет и курса
с) список студентов, родившихся после заданного года
d) список учебной группы
*/
    public static void printStudens(List<Student> studentsList) {
        for (int i=0; i<studentsList.size();i++) {
            System.out.println(studentsList.get(i));
        }
    }

    protected static List<Student> listStudentFaculty(List<Student> studentsList, String faculty){
        System.out.println("Список студентов "+ faculty+" факультета: " );
        List<Student>students=new ArrayList<Student>();
        for (int i=0; i<studentsList.size();i++) {
            if (faculty==studentsList.get(i).faculty){
                students.add(studentsList.get(i));
            }
        }
        return  students;
    }

    protected static List<Student> listStudensGroup(List<Student> studentsList, String group){
        System.out.println("Список студентов "+ group +" группы:");
        List<Student>students=new ArrayList<Student>();
        for (int i=0; i<studentsList.size();i++) {
            if (group==studentsList.get(i).group){
                students.add(studentsList.get(i));
            }
        }
        return students;
    }

    protected static List<Student> listStudensAfterYear(List<Student>studentsList,int year){
        Calendar calendar=new GregorianCalendar(year,11,31);
        System.out.println("Список студентов родившихся после "+ year +" года");
        List<Student>students=new ArrayList<Student>();
        for (int i=0; i<studentsList.size();i++) {
            if (studentsList.get(i).getBirthday().after(calendar)){
                students.add(studentsList.get(i));
            }
        }
        return  students;
    }

    protected static List<Student> listStudensFacultyAndCourse(List<Student>studentsList,String faculty,int course){
        System.out.println("Список студентов "+ faculty+" факультета " +course+" курса:");
        List<Student>students=new ArrayList<Student>();
        for (int i=0; i<studentsList.size();i++) {
            if (faculty==studentsList.get(i).faculty && course==studentsList.get(i).course){
                students.add(studentsList.get(i));
            }
        }
        return students;
    }

}
