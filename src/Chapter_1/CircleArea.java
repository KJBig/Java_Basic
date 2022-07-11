package Chapter_1;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("반지름을 입력하시오: ");
        double r = sc.nextDouble();

        double area = r * r * 3.14;

        System.out.println(area);

    }
}
