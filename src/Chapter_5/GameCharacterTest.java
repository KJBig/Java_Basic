package Chapter_5;

import jdk.swing.interop.SwingInterOpUtils;

import java.net.PortUnreachableException;
import java.util.ArrayList;

class GameCharacter{

    class GameItem{
        private String name;
        private int type;
        private int price;

        int getPrice(){
            return this.price;
        }

        public String toString(){
            return name + " => 타입 : "  + type + ", 가격 : " + this.price;
        }

    }

    private ArrayList<GameItem> list = new ArrayList<>();

    void add(String name, int type, int price){
        GameItem i1 = new GameItem();
        i1.name = name;
        i1.type = type;
        i1.price = price;
        list.add(i1);
    }

    void print(){
        int total = 0;
        for(GameItem i : list){
            System.out.println(i);
            total += i.getPrice();
        }
        System.out.println("총 금액은 " + total);
    }

}

public class GameCharacterTest {
    public static void main(String[] args){
        GameCharacter c1 = new GameCharacter();
        c1.add("Sword", 1, 100);
        c1.add("Gun", 2, 50);
        c1.print();
    }
}
