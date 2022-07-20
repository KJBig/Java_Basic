package Chapter_5;
class Time{
    private int hour;
    private int minute;
    private int second;

    Time(){
        this(0, 0, 0);
    }


    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

}

public class TimeTest {
    public static void main(String[] args){
        Time t1 = new Time();
        System.out.println(t1);
        Time t2 = new Time(10, 30, 25);
        System.out.println(t2);


    }
}
