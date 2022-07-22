package Chapter_6;

import java.lang.reflect.WildcardType;

class Shape{
    private int x;
    private int y;

    public int getX(){return x;}
    public int getY(){return y;}
    public void setX(int x){ this.x = x;}
    public void setY(int y){ this.y = y;}

    void print(){
        System.out.println("(x, y) = (" + x + "," + y + ")");
    }
}

class Rectangle extends Shape{
    private int width;
    private int height;

    public int getWidth(){return width;}
    public int getHeight(){return height;}
    public void setWidth(int width){ this.width = width;}
    public void setHeight(int height){ this.height = height;}

    double area(){
        return (double)(width * height);
    }

    void draw(){
        System.out.println("(" + this.getX() + ", " + this.getY() + ") 위치에 가로 : " + width +", 세로 : " + height);
    }

}

public class RectangleTest {
    public static void main(String[] args){
        Rectangle R1 = new Rectangle();
        Rectangle R2 = new Rectangle();

        R1.setX(5);
        R1.setY(3);
        R1.setWidth(10);
        R1.setHeight(20);

        R2.setX(8);
        R2.setY(9);
        R2.setWidth(10);
        R2.setHeight(20);

        R1.print();
        R1.draw();

        R2.print();
        R2.draw();
    }
}
