package Chapter_3;

import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int student_num = 5;
        int[] score_ary = new int[student_num];
        int total = 0;

        for(int i = 0; i < student_num; i++){
            System.out.print("성적을 입력하시오: ");
            int score = sc.nextInt();
            score_ary[i] = score;
        }

        for(int i = 0; i < student_num; i++){
            total += score_ary[i];
        }

        System.out.println("평균 성적은 " + total/student_num + "입니다.");

    }
}
