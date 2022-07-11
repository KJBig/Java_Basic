package Chapter_1;

import java.util.Scanner;

public class Box {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("사각형의 가로를 입력하시오: ");
        int w = sc.nextInt();
        System.out.print("사각형의 높이를 입력하시오: ");
        int h = sc.nextInt();

        double area = w * h;
        double len = (w + h) * 2;

        System.out.println("사각형의 넓이는 : " + area);
        System.out.println("사각형의 둘레는 : " + len);
    }
}
