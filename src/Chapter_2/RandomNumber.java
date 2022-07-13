package Chapter_2;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        System.out.print("난수의 개수: ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i=0; i<n; i++){
            int ranN = ran.nextInt(100);
            sum += ranN;
        }

        System.out.println("난수 " + n + "개의 합은 " + sum);

    }
}
