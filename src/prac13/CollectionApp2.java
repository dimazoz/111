package ru.mirea.task13;
import java.util.LinkedList;

public class CollectionApp2 {
    public static void main(String[] args){
        LinkedList<String> cosmetics = new LinkedList<String>();
        cosmetics.add("Пудра");
        cosmetics.add("Консилер");
        cosmetics.addLast("Помада");
        cosmetics.addFirst("Подводка");
        cosmetics.add(1,"Тушь");

        System.out.printf("В списке %d элементов \n", cosmetics.size());

        for(String cosmetic : cosmetics){
            System.out.println(cosmetic);
        }
        if(cosmetics.contains("Помада")){
            System.out.println("Список содержит косметическое средство Помада");
        }
        cosmetics.removeFirst();
        System.out.println("Список после удаления первого элемента:");
        for(String cosmetic : cosmetics){
            System.out.println(cosmetic);
        }
    }

}
