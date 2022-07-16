package Chapter_3;

import java.util.Random;
import java.util.Scanner;

public class Tic_Tac_Toe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[][] ary = new String[3][3];

        int x, y;
        int cx, cy;

        //배열 초기화
        for(int i=0; i<ary.length; i++){
            for(int j=0; j<ary[i].length; j++){
                ary[i][j] = " ";
            }
        }


        while(true){
            // 게임판 출력
            for(int i=0; i< ary.length; i++){
                System.out.println(" " + ary[i][0] + " |"
                                +" " + ary[i][1] + " |"
                                +" " + ary[i][2]);
                if( i != 2) {
                    System.out.println("---|---|---");
                }
            }
            // 사용자 턴
            System.out.print("다음 수의 좌표를 입력하시오:");
            x = sc.nextInt();
            y = sc.nextInt();

            if(ary[x][y] == " ") {
                ary[x][y] = "X";
            }
            else{
                System.out.println("잘못된 위치입니다.");
                continue;
            }

            // 컴퓨터 턴
            do {
                cx = rand.nextInt(3);
                cy = rand.nextInt(3);
            }while(ary[cx][cy] != " ");

            ary[cx][cy] = "O";

            // 게임 끝 검사
            if(ary[0][0] != " " && ary[0][0] == ary[0][1] && ary[0][1] == ary[0][2] || // -가로-
                    ary[1][0] != " " && ary[1][0] == ary[1][1] && ary[1][1] == ary[1][2] ||
                    ary[2][0] != " " && ary[2][0] == ary[2][1] && ary[2][1] == ary[2][2] ||

                    ary[0][0] != " " && ary[0][0] == ary[1][0] && ary[1][0] == ary[2][0] || // -세로-
                    ary[0][1] != " " && ary[0][1] == ary[1][1] && ary[1][1] == ary[2][1] ||
                    ary[0][2] != " " && ary[0][2] == ary[1][2] && ary[1][2] == ary[2][2] ||

                    ary[0][0] != " " && ary[0][0] == ary[1][1] && ary[1][1] == ary[2][2] || // -대각-
                    ary[0][2] != " " && ary[0][2] == ary[1][1] && ary[1][1] == ary[2][0]){

                System.out.println("\n=============");
                System.out.println("게임종료");
                System.out.println("=============");

                for(int i=0; i< ary.length; i++){
                    System.out.println(" " + ary[i][0] + " |"
                            +" " + ary[i][1] + " |"
                            +" " + ary[i][2]);

                    if( i != 2) {
                        System.out.println("---|---|---");
                    }

                }

                break;
            }

        }

    }
}