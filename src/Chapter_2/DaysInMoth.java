package Chapter_2;

import java.util.Scanner;

public class DaysInMoth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("일수를 알고 싶은 월을 입력하시오: ");
        int month = sc.nextInt();
        int days = 0;
        switch (month){
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                days = 28;
                break;
            default:
                days = 31;
                break;
        }
        System.out.println("월의 날수는 " + days);
    }
}
