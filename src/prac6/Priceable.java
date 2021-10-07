package prac6;

public interface Priceable {
    int getPrice();
}

class Tea implements Priceable{
    @Override
    public int getPrice() {
        return 150;
    }
}
class Coffee implements Priceable{
    @Override
    public int getPrice() {
        return 250;
    }
}

class Test2 {
    public static void main(String[] args) {
        Tea tea = new Tea();
        System.out.println(tea.getPrice());
        Coffee coffee = new Coffee();
        System.out.println(coffee.getPrice());
    }
}

