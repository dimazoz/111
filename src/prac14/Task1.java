package ru.mirea.task14;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Task1 {

    public static void main(String[] args) {

        Queue<Integer> player1 = new ArrayDeque<>();
        Queue<Integer> player2 = new ArrayDeque<>();

        Scanner in = new Scanner(System.in);
        player1.offer(in.nextInt());
        player1.offer(in.nextInt());
        player1.offer(in.nextInt());
        player1.offer(in.nextInt());
        player1.offer(in.nextInt());

        player2.offer(in.nextInt());
        player2.offer(in.nextInt());
        player2.offer(in.nextInt());
        player2.offer(in.nextInt());
        player2.offer(in.nextInt());

        int t = 0;

        while (true){

            int c1, c2;
            c1 = player1.poll();
            c2 = player2.poll();
            if (c2 > c1 || c2 == 0 && c1 == 9){
                player2.offer(c1);
                player2.offer(c2);
                t++;
            }
            else if (c1 > c2 || c1 == 0 && c2 == 9){
                player1.offer(c1);
                player2.offer(c2);
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
