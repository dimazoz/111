package ru.mirea.task14;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Deque<Integer> player1 = new ArrayDeque<>();
        Deque<Integer> player2 = new ArrayDeque<>();

        Scanner in = new Scanner(System.in);
        player1.addFirst(in.nextInt());
        player1.addFirst(in.nextInt());
        player1.addFirst(in.nextInt());
        player1.addFirst(in.nextInt());
        player1.addFirst(in.nextInt());

        player2.addFirst(in.nextInt());
        player2.addFirst(in.nextInt());
        player2.addFirst(in.nextInt());
        player2.addFirst(in.nextInt());
        player2.addFirst(in.nextInt());

        int t = 0;

        while (true){

            int c1, c2;
            c1 = player1.pollLast();
            c2 = player2.pollLast();
            if (c2 > c1 || c2 == 0 && c1 == 9){
                player2.addFirst(c1);
                player2.addFirst(c2);
                t++;
            }
            else if (c1 > c2 || c1 == 0 && c2 == 9){
                player1.addFirst(c1);
                player2.addFirst(c2);
                t++;
            }

            if (player1.isEmpty()){
                System.out.println("second " + t);
                break;
            }

            if (player2.isEmpty()){
                System.out.println("first " + t);
                break;
            }

            if (t == 106){
                System.out.println("botva");
                break;
            }
        }
    }
}
