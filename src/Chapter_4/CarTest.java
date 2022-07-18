package Chapter_4;

class Car{
    String color;
    int speed;
    int gear;

    Car(String _color){
        color = _color;
    }

    public String toString(){
        return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
    }

    void changeGear(int g){
        gear = g;
    }

    void speedUp(){
        speed += 10;
    }

    void speedDown(){
        speed -= 10;
    }
}

public class CarTest {
    public static void main(String[] args){
        Car c1 = new Car("red");

        c1.changeGear(1);
        c1.speedUp();
        System.out.println(c1);

        c1.changeGear(0);
        c1.speedDown();
        System.out.println(c1);

    }
}
