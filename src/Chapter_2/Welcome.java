package Chapter_2;

import java.util.Date;

public class Welcome {
    public static void main(String[] args){
        Date date = new Date();
        int currentHour = date.getHours();
        System.out.println("현재시간은 " + currentHour);

        if(currentHour < 12){
            System.out.println("Good morning");
        }
        else if(currentHour < 18){
            System.out.println("Good afternoon");
        }
        else if(currentHour < 21){
            System.out.println("Good evening");
        }
        else {
            System.out.println("Good night");
        }
    }
}
