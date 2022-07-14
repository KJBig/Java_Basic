package Chapter_3;

import java.util.Scanner;

public class SeqSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] ary = {0, 10, 20, 30, 40, 50};
        System.out.print("탐색할 값을 입력하시오: ");
        int num = sc.nextInt();

        int where = -1;

        for(int i = 0; i < ary.length; i++){
            if(num == ary[i]){
                where = i;
                break;
            }
        }

        if(where != -1) {
            System.out.println(num + "값은 " + where + "위치에 있습니다.");
        }
        else{
            System.out.println(num + "값은 해당 배열에 없습니다.");
        }


    }
}
