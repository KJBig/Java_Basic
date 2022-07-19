package tt;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);

        String url;
        while(true) {
            System.out.print("문자열을 입력하세요> ");
            url = sc.nextLine();

            if(url.equals("quit")){
                break;
            }

            if(url.matches("^www\\.(.+)")){
                System.out.println(url + "은 'www'로 시작합니다.");
            }
            else{
                System.out.println(url + "은 'www'로 시작하지 않습니다.");
            }

        }

    }
}
