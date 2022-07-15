package Chapter_3;

import java.util.Random;

public class RollDice {
    public static void main(String[] args){
        Random ran = new Random();

        final int size = 6;
        int[] freq = new int[size];

        for(int i = 0; i < 10000; i++){
            int num = ran.nextInt(size);
            freq[num]++;
        }

        System.out.println("==============");
        System.out.println("면    빈도");
        System.out.println("==============");
        for(int i = 0; i < size; i++){
            System.out.println(i+1 + "    " + freq[i]);
        }

    }
}
