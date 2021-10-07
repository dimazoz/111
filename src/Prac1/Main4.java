package Prac1;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Main4 {
    public static void main(String[] args) {

        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        Random mmm = new Random();
        int mmas[] = new int[n];
        System.out.println("Случайный массив=");
        for (int iii = 0; iii < n; iii++) {
            mmas[iii] = mmm.nextInt(101);
            System.out.println(mmas[iii]);
        }
        Arrays.sort(mmas);
        System.out.println("Отсортированный массив =" + Arrays.toString(mmas));
    }
}