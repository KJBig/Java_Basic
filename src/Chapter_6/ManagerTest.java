package Chapter_6;
class Employee{
    public String name;
    String address;
    protected int salary;
    private int rrn;

    public Employee(String name, String address, int salary, int rrn){
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.rrn = rrn;
    }

    public String toString(){
        return "Employee [name = " + name + ", address = " + address + ", salary = " + salary + ", rrn = " + rrn + "]";
    }

}

class Manager extends Employee{
    int bonus;

    Manager(String name, String address, int salary, int rrn, int bonus) {
        super(name, address, salary, rrn);
        this.bonus= bonus;
    }

    void test(){
        System.out.println("name = " + name);
        System.out.println("address = " + address);
        System.out.println("salary = " + salary);
        //System.out.println("rrn = " + rrn); 접근불가.
    }

    public String toString(){
        return super.toString() + "+ [bonus = " + bonus + "]";
    }

}

public class ManagerTest {
    public static void main(String[] args){
        Manager m1 = new Manager("철수", "서울", 1000, 123456, 200);

        System.out.println(m1);
        m1.test();;

    }
}
