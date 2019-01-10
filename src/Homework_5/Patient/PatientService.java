package Homework_5.Patient;

import java.util.ArrayList;
import java.util.List;
//Создать классы, спецификации которых приведены ниже.
// Определить конструкторы и методв setТип(), getТип(), toString()
// Определить дополнительно методы в классе, создающем массив объектов.
//Задать критерий выбора данных и вывести эти данные на консоль.
//В каждом классе, обладающем информацией, должно быть объявленно несколько конструкторов.
//1. Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской карты, Диагноз.
// Создать массив объектов. Вывести:
//а) список пациентов, имеющих данный диагноз ;
//б) список пациентов, номер медицинской карты которых находится в заданном интервале.

public class PatientService extends Patient {

    public static void printPatients(List<Patient> patients) {
        for (int i = 0; i < patients.size(); i++) {
            System.out.println(patients.get(i));
        }
    }

    public static List<Patient> listPatientsWithDiagnosis(List<Patient> patients, String diagnosis) {
        List<Patient> patientList = new ArrayList<Patient>();
        System.out.println("Список пациентов с диагнозом " + diagnosis);
        for (int i = 0; i < patients.size(); i++) {
            if (diagnosis == patients.get(i).diagnosis) {
                patientList.add(patients.get(i));
            }
        }
        return patientList;
    }

    protected static List<Patient> listPatientsNumberMedCardOfInterval(List<Patient> patients,int startInterval, int finfshInterval) {
        System.out.println("Список пациентов с мед. картами в интервале от " + startInterval + " до " + finfshInterval);
        List<Patient>patientList=new ArrayList<Patient>();
        for (int i = 0; i < patients.size(); i++) {
            if (startInterval < patients.get(i).numberMedCard && finfshInterval > patients.get(i).numberMedCard) {
                patientList.add(patients.get(i));
            }
        }
        return patientList;
    }

}
