package Chapter_1;

public class CalTime {
    public static void main(String[] args){
        final  double light_speed = 300000;
        double distance = 40e12;

        double how_sec = distance/light_speed;

        double light_year = how_sec/(365 * 24 * 60 * 60);

        System.out.println("걸린시간은 " + light_year + "광년입니다.");
    }
}
