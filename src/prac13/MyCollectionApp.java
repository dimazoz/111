package ru.mirea.task13;
import java.util.Arrays;

public class MyCollectionApp {
    private int[] arr;
    public MyCollectionApp(){
        arr = new int[1];
    }
    public MyCollectionApp(int length){
        arr = new int[length];
    }

    public void add(int number){
        arr[arr.length-1] = number;
        arr = Arrays.copyOf(arr, arr.length + 1);
    }

    public void remove(int index){
        for(int a = index; a< arr.length-1;a++){
            arr[a] = arr[a+1];
        }
        arr = Arrays.copyOf(arr, arr.length-1);
    }

    public static void main(String[] args) {
        MyCollectionApp list = new MyCollectionApp();
        System.out.println(list.arr.length);
        list.add(2);
        System.out.println(list.arr.length);
        list.add(3);
        System.out.println(list.arr.length);
        list.remove(0);
        System.out.println(list.arr.length);
    }

}
