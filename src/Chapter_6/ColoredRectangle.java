package Chapter_6;
class Shape_{
    private int x;
    private int y;

    Shape_(int x, int y){
        System.out.println("Shape()");
        this.x = x;
        this.y = y;
    }
}

class Rectangle_ extends Shape_{
    private int width;
    private int height;

    Rectangle_(int x, int y, int width, int height){
        super(x, y);
        System.out.println("Rectangle()");
        this.width = width;
        this.height = height;
    }

}

public class ColoredRectangle extends Rectangle_ {
    String color;

    ColoredRectangle(int x, int y, int width, int height, String color){
        super(x, y, width, height);
        System.out.println("ColoredRectangle()");
        this.color = color;
    }

    public static void main(String[] args){
        ColoredRectangle cr = new ColoredRectangle(10, 10, 20, 20, "RED");
    }
}
