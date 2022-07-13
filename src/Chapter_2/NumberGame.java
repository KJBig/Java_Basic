package Chapter_2;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int Q = ran.nextInt(100)+1;
        int A = 0;
        int count = 0;
        do{
            System.out.print("정답을 추측하여 보시오: ");
            A = sc.nextInt();
            count += 1;

            if(Q == A){
                System.out.print("축하합니다.   ");
                System.out.println("시도횟수 : " + count);
            }
            else if(Q > A){
                System.out.println("제시한 정수가 낮습니다.");
            }
            else if(Q < A){
                System.out.println("제시한 정수가 높습니다.");
            }

        }while(Q != A);
    }
}
