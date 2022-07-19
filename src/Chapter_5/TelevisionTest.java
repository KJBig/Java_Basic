package tt6;
class Television{
    private int channel;
    private int volume;
    private boolean onOff;

    Television(int channel, int volume, boolean onOff){
        this.channel = channel;
        this.volume = volume;
        this.onOff = onOff;
    }

    void print(){
        System.out.println("채널은 " + channel +"이고 볼륨은 " + volume + "입니다.");
    }

}

public class TelevisionTest {
    public static void main(String[] args){
        Television t1 = new Television(7, 19 , true);
        t1.print();
        Television t2 = new Television(11, 20 , true);
        t2.print();
    }
}
