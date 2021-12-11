package ru.mirea.task26;

public class KPWConvert implements ConvertibleStrategy{
    @Override
    public void convers(double a){
        System.out.println("Неконвертируемая валюта");
    }
}