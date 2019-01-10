package Homework_5.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRanner {
    //Создать классы, спецификации которых приведены ниже.
    // Определить конструкторы и методв setТип(), getТип(), toString()
    // Определить дополнительно методы в классе, создающем массив объектов.
    //Задать критерий выбора данных и вывести эти данные на консоль.
    //В каждом классе, обладающем информацией, должно быть объявленно несколько конструкторов.
    //1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет,Курс, Группа.
    // Создать массив объектов. Вывести:
    //а) список студентов заданного факультета.
    //б) список студентов для каждого факультеет и курса
    //с) список студентов, родившихся после заданного года
    //d) список учебной группы

    public static void main(String[] args) {
        Student student0 = new Student(1, "Kalinovskay", "Kate", "Nikolaevna",
                2005,03,23, "Pinsk,str Center, 23-56", "+375 29 695 82 64", "Math", 2
                , "M203");
        Student student1 = new Student(2, "Ivanov", "Viktor", "Sergeevich",
                1987,3,23, "Pinsk,str Center, 23-56", "+375 29 695 82 64", "Math", 3
                , "M303");
        Student student2 = new Student(3, "Petov", "Mihail", "Nikolaevich",
                1990,5,23, "Pinsk,str Center, 23-56", "+375 29 695 82 64", "Infor", 5
                , "I503");
        List<Student> students = new ArrayList<Student>();
        students.add(student0);
        students.add(student1);
        students.add(student2);
        StudentService.printStudens(students);
        System.out.println();

        StudentService.printStudens(StudentService.listStudentFaculty(students,"Math"));
        System.out.println();

        StudentService.printStudens(StudentService.listStudensGroup(students,"I503"));
        System.out.println();

        StudentService.printStudens(StudentService.listStudensFacultyAndCourse(students,"Math", 2));
        System.out.println();

        StudentService.printStudens(StudentService.listStudensAfterYear(students,1990));
    }
}

