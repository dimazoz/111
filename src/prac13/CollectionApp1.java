package ru.mirea.task13;
import java.util.ArrayList;

public class CollectionApp1 {
    public static void main(String[] args){
        ArrayList<String> animals = new ArrayList<String>();
        // добавим в список ряд элементов
        animals.add("Кенгуру");
        animals.add("Лошадь");
        animals.add("Собака");
        animals.add("Кошка");
        animals.add(2,"Куница"); // добавляем элемент по индексу 1

        System.out.println(animals.get(1)); // получаем 2 объект
        animals.set(1, "Носорог"); // установка нового значения для 2 объекта

        System.out.printf("В списке %d элементов: \n", animals.size());
        for (String animal : animals){
            System.out.println(animal);
        }

        if (animals.contains("Кенгуру")){
            System.out.println("Список содержит животное Кенгуру");
        }

        animals.remove("Кенгуру");
        animals.remove(1);

        Object[] beasts = animals.toArray();
        for(Object beast : beasts){
            System.out.println(beast);
        }
    }

}
