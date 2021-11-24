package ru.mirea.task15;

import java.io.FileReader;
import java.io.IOException;

public class Task2 {

    public static void main(String[] args) {

        try(FileReader reader = new FileReader("/Users/katshido/Downloads/file.txt"))
        {
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
