package ru.mirea.task14;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Deque<Integer> player1 = new ArrayDeque<>();
        Deque<Integer> player2 = new ArrayDeque<>();

        while(true) {
            System.out.println("Введите колоды двух игроков. Карты не должны повторяться!");
            System.out.println("Введите колоду первого игрока. Колода состоит из 5 различных карт");
            Scanner in = new Scanner(System.in);
            player1.addFirst(in.nextInt());
            player1.addFirst(in.nextInt());
            player1.addFirst(in.nextInt());
            player1.addFirst(in.nextInt());
            player1.addFirst(in.nextInt());

            System.out.println("Введите колоду второго игрока. Колода состоит из 5 различных карт");
            player2.addFirst(in.nextInt());
            player2.addFirst(in.nextInt());
            player2.addFirst(in.nextInt());
            player2.addFirst(in.nextInt());
            player2.addFirst(in.nextInt());

            if (!player1.contains(0) && !player2.contains(0)
                    || !player1.contains(1) && !player2.contains(1)
                    || !player1.contains(2) && !player2.contains(2)
                    || !player1.contains(3) && !player2.contains(3)
                    || !player1.contains(4) && !player2.contains(4)
                    || !player1.contains(5) && !player2.contains(5)
                    || !player1.contains(6) && !player2.contains(6)
                    || !player1.contains(7) && !player2.contains(7)
                    || !player1.contains(8) && !player2.contains(8)
                    || !player1.contains(9) && !player2.contains(9)) {

                System.out.println("Некорректный ввод. Карты не должны повторяться среди двух игроков!");
            } else {
                break;
            }
        }

        int t = 0;

        while (true){

            System.out.println("\nХод " + (t+1));
            int c1, c2;
            c1 = player1.pollLast();
            c2 = player2.pollLast();
            System.out.println("Игрок 1: " + c1 + "\nИгрок 2: " + c2);
            if (c2 > c1 || c2 == 0 && c1 == 9){
                System.out.println("Карта игрока 2 побеждает. Карты " + c1 + " и " + c2 + " уходят игроку 2");
                player2.addFirst(c1);
                player2.addFirst(c2);
                t++;
                print(player1, player2);
            }
            else if (c1 > c2 || c1 == 0 && c2 == 9){
                System.out.println("Карта игрока 1 побеждает. Карты " + c1 + " и " + c2 + " уходят игроку 1");
                player1.addFirst(c1);
                player1.addFirst(c2);
                t++;
                print(player1, player2);
            }

            if (player1.isEmpty()){
                System.out.println("Колода игрока 1 пуста. Игрок 2 победил! Количество ходов: " + (t+1));
                break;
            }

            if (player2.isEmpty()){
                System.out.println("Колода игрока 2 пуста. Игрок 1 победил! Количество ходов: " + (t+1));
                break;
            }

            if (t == 105){
                System.out.println("Игра длится слишком долго. Ничья");
                break;
            }
        }
    }

    static void print(Deque<Integer> player1, Deque<Integer> player2){
        System.out.print("Колода 1 игрока:");
        for (int c:
             player1) {
            System.out.print(" " + c);
        }
        System.out.print("\nКолода 2 игрока:");
        for (int c:
                player2) {
            System.out.print(" " + c);
        }
        System.out.println();
    }
}
