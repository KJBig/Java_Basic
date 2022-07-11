package Chapter_1;

public class QuadraticEq {
    public static void main(String[] args){
        double b = -3.0;
        double c = 2.0;

        double root = Math.sqrt(b*b - 4*c);
        double r1 = (-b + root)/2;
        double r2 = (-b - root)/2;

        System.out.println("근은 " + r1);
        System.out.println("근은 " + r2);

    }
}
