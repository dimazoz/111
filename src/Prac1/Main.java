package Prac1;

public class Main {
    public static void main(String[] args) {
                int myArray[] = {3, 4, 4, 5, 5};
                int sum = 0;
                for (int i = 0; i < myArray.length; i++) {
                    sum += myArray[i];

                }
                System.out.println("Сумма равна =" + sum);
                int i = 0;
                sum = 0;
                while (i < 5) {
                    sum += myArray[i];
                    i++;
                }
                System.out.println("Сумма равна =" + sum);
                i = 0;
                sum = 0;
                do {
                    sum += myArray[i];
                    i++;
                }
                while (i < 5);
                System.out.println("Сумма равна =" + sum);
            }
        }
