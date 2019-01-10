package Homework_6.Student;
import java.util.*;

public class Student {
    // Напишите класс Student, предоставляющий информацию об имени студента методом getName() и о его курсе методом getCourse().
    // Напишите метод printStudents(List students, int course), который получает список студентов и номер курса и печатает в консоль
    // имена тех студентов из списка, которые обучаются на данном курсе. Для обхода списка в этом методе используйте итератор.
    //Протестируйте ваш метод (для этого предварительно придется создать десяток объектов класса Student и поместить их в список).

    private int id;
    public String surname;
    public String name;
    public String patronymic;
    public String faculty;
    public int course;
    public String group;


    public Student(int id, String surname, String name, String patronymic,
                   String faculty, int course, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return getClass().getName() + "@name: " + name + " id: " + id + " surname: " + surname + " patronymic: " + patronymic +
                " faculty: " + faculty + " course: " + course + " group: " + group;
    }

    @Override
    public int hashCode() {
        return this.id * 31 + ((this.surname == null) ? 0 : this.surname.hashCode()) +
                ((this.name == null) ? 0 : this.name.hashCode()) +
                ((this.patronymic == null) ? 0 : this.patronymic.hashCode()) +
                ((this.faculty == null) ? 0 : this.faculty.hashCode()) +
                course + ((this.group == null) ? 0 : this.group.hashCode());
    }
}


