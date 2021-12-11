package ru.mirea.task26;

public class EUR extends Money{
    public EUR(){
        this.convStrategy = new EURConvert();
    }
}