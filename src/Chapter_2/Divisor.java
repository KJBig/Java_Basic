package Chapter_2;

import java.util.Scanner;

public class Divisor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수를 입력하시오: ");
        int x = sc.nextInt();

        System.out.println(x+"의 약수는 다음과 같습니다.");

        for(int i = 1; i <= x; i++){
            if( x%i == 0 ){
                System.out.print(i + " ");
            }
        }
    }
}