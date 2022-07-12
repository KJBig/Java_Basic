package Chapter_2;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("두개의 정수를 입력하시오(큰수, 작은수): ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        System.out.println("최대 공약수는 " + a);
    }
}
