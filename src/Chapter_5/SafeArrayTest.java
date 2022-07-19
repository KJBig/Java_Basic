package tt6;
class SafeArray{
    int[] a;
    int lenght;

    SafeArray(int _lenght){
        a = new int[_lenght];
        lenght = _lenght;
    }

    int get(int index){
        if(index <= lenght) {
            return a[index];
        }
        else{
            return -1;
        }
    }

    void put(int index, int value){
        if(index >= 0 && index < lenght){
            a[index] = value;
        }
        else{
            System.out.println("잘못된 index : " + index);
        }

    }


}
public class SafeArrayTest {
    public static void main(String[] args){
        SafeArray ary1 = new SafeArray(3);

        ary1.put(0,10);
        System.out.println(ary1.get(0));
        ary1.put(3,30);

    }
}
