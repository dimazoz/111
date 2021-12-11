package ru.mirea.task25;

public class SavingsAccount extends SpecialAccount{
    public SavingsAccount(BankAccount bankAcc){
        super(bankAcc, "Сберегательный счёт", 10);
    }
}