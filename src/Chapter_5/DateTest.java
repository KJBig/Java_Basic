package tt6;

class Date{
    private int year;
    private String month;
    private int day;

    Date(){
        this(1900,"1월",1);
    }

    Date(int year){
        this(year,"1월",1);
    }

    Date(int year, String month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toString(){
        return "Date [year=" + this.year + ", month=" + this.month +", day=" + this.day + "]";
    }

}

public class DateTest {
    public static void main(String[] args){
        Date d1 = new Date();
        Date d2 = new Date(2020);
        Date d3 = new Date(2015, "8월", 10);

        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());

    }
}
