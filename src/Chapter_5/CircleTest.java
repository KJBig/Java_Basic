package Chapter_5;

class Point{
    private int x, y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "Point [x = " + x + ", y = " + y +"]";
    }

}

class Circle{
    private int radius;
    private Point center;

    Circle(Point center, int radius){
        this.center = center;
        this.radius = radius;
    }

    public String toString(){
        return "Circle [radius = " + radius + ", center = " + center +"]";
    }


}

public class CircleTest {
    public static void main(String[] args){
        Point p = new Point(25, 78);
        System.out.println(p);
        Circle c = new Circle(p, 10);
        System.out.println(c);

    }
}
