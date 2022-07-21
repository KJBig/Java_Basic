package Chapter_5;
class Box2{
    int width;
    int length;
    int height;

    Box2(int width, int length, int height){
        this.width = width;
        this.length = length;
        this.height = height;
    }

    boolean isSameBox(Box2 obj){

        if((this.width == obj.width) && (this.length == obj.length) && (this.height == obj.height)){
            return true;
        }
        else{
            return false;
        }

    }

}

public class BoxTest2 {
    public static void main(String[] args){
        Box2 b1 = new Box2(10, 20, 50);
        Box2 b2 = new Box2(10, 20, 50);
        Box2 b3 = new Box2(10, 10, 50);
        System.out.println("b1 == b2 : " + b1.isSameBox(b2));
        System.out.println("b2 == b3 : " + b2.isSameBox(b3));

    }
}
