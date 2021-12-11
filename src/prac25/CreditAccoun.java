package ru.mirea.task25;

class CreditAccount extends SpecialAccount{
    public CreditAccount(BankAccount bankAcc){
        super(bankAcc, "Кредитный счёт", 8);
    }
}
