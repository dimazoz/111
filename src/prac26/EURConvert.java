package ru.mirea.task26;

public class EURConvert implements ConvertibleStrategy{
    public void convers(double a){
        double val = 0.011771;
        val = val*a;
        System.out.println("Перевод " + a + " рублей в евро: " + val);
    }
}