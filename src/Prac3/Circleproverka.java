package Prac3;

public class Circleproverka {
        public static void main(String[] args) {
            Circle o1 = new Circle();
            o1.printCircle(); // Окружность с центром (0.0;0.0) и радиусом 1.0
            Circle o2 = new Circle(1,-1,14);
            o2.printCircle(); // Окружность с центром (1.0;-1.0) и радиусом 14.0
            System.out.println("Площадь круга o2: "+o2.squareCircle()); //615.75...
            o1.zoomCircle(14);
            if(o1.equalsCircle(o2)) {
                System.out.println("Круги o2 и o1 имеют равную площадь");
            } else {
                System.out.println("Круги o2 и o1 имеют различную площадь");
            }
        }
    }

