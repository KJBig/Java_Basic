package Chapter_3;

import java.util.Scanner;

public class TheaterReserve {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int size = 10;
        int[] seats = new int[size];

        while(true){
            System.out.println("----------------------------");
            for(int i = 1; i <= size; i++)
                System.out.print(i + " ");
            System.out.println("\n----------------------------");
            for(int i = 0; i < size; i++)
                System.out.print(seats[i] + " ");
            System.out.print("\n원하시는 좌석번호를 입력하세요(종료는 -1): ");

            int x = sc.nextInt();
            if(x == -1){
                System.out.println("종료");
                break;
            }

            if(seats[x-1] == 0){
                seats[x-1] = 1;
                System.out.println("예약되었습니다.");
            }
            else{
                System.out.println("이미 예약된 자리입니다.");
            }

            System.out.println("");
        }
    }
}
