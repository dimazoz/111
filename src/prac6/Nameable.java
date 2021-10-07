package prac6;

public interface Nameable {
    String getName();
}
class Planet implements Nameable {
    public String getName(){
        return "MARS";
    }
}
class Car implements Nameable{
    public String getName(){
        return "BMW";
    }
}

class Test{
    public static void main(String[] args) {
        Planet planet = new Planet();
        System.out.println(planet.getName());
        Car car = new Car();
        System.out.println(car.getName());
    }
}