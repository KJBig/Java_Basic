package Chapter_6;
class Animal{
    private double weight;
    private String picture;
    protected String name;

    Animal(String name){
        this.name = name;
    }

    void eat(){
        System.out.println(this.name + "이(가) 먹이를 먹는다.");
    }

    void sleep(){
        System.out.println(this.name + "이(가) 잠을 잔다.");
    }

}

class Lion extends Animal{
    private int legs = 4;

    Lion(String name) {
        super(name);
    }

    void roar(){
        System.out.println(this.name + "의 어흥!");
    }

}

class Eagle extends Animal{
    private int wings = 2;

    Eagle(String name) {
        super(name);
    }

    void fly(){
        System.out.println(this.name + "이(가) 비행한다.");
    }

}

public class AnimalTest {
    public static void main(String[] args){
        Lion l1 = new Lion("사왕자");
        l1.eat();
        l1.sleep();
        l1.roar();


        Eagle e1 = new Eagle("독공주");
        e1.eat();
        e1.sleep();
        e1.fly();
    }
}
