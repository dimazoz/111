package ru.mirea.task15;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {

    public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("/Users/katshido/Downloads/file.txt", true))
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String text = reader.readLine();
            writer.write(text);

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
