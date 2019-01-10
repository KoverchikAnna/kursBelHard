package Homework_6.Convert;

import java.util.ArrayList;
import java.util.List;
//Написать метод для конвертации массива строк/чисел в список.
//Желательно использовать реализацию функционального интерфейса, содержащего метод: List <T> convert(T [] objectArray);

class ConvertMasInList<T> implements Convert <T> {
    @Override
    public List<T> convert(T[] ObgectArray) {
        List<T> list = new ArrayList<T>();
        for (int i = 0; i < ObgectArray.length; i++) {
            list.add(ObgectArray[i]);
        }
        return list;
    }
}

