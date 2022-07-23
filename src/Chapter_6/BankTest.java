package Chapter_6;
class Bank{

    double getInterestRate(){
        return 0.0;
    }
}
class BadBank extends Bank{
    double getInterestRate(){
        return 10.0;
    }
}

class NormalBank extends Bank{
    double getInterestRate(){
        return 5.0;
    }
}

class GoodBank extends Bank{
    double getInterestRate(){
        return 3.0;
    }
}

public class BankTest {
    public static void main(String[] args){
        BadBank Bb = new BadBank();
        NormalBank Nb = new NormalBank();
        GoodBank Gb = new GoodBank();

        System.out.println("BadBank의 이자율 : " + Bb.getInterestRate());
        System.out.println("NormalBank의 이자율 : " + Nb.getInterestRate());
        System.out.println("GoodBank의 이자율 : " + Gb.getInterestRate());

    }
}
