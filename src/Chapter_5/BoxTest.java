package tt6;
class Box{
    private int width;
    private int length;
    private int height;
    private int volume;

    Box(int width, int length, int height){
        this.width = width;
        this.length = length;
        this.height = height;;
        volume = this.width * this.length * this.height;
    }


    int getVolume(){
        return volume;
    }


}

public class BoxTest {
    public static void main(String[] args){
        Box b1 = new Box(20, 20, 30);
        System.out.println("상자의 부피는 " + b1.getVolume() + "입니다.");
    }
}
