package Chapter_5;

import java.util.Scanner;

class arryProc{

    void getValues(int[] array){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            System.out.print("성적을 입력하시오: ");
            array[i] = sc.nextInt();
        }
    }

    double getAverage(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }

        return sum/array.length;
    }

}

public class arryProcTest {
    public static void main(String[] args){
        final int STUDENTS = 5;
        int[] array = new int[STUDENTS];
        arryProc a1 = new arryProc();
        a1.getValues(array);
        System.out.println("평균은 = "+ a1.getAverage(array));


    }
}
