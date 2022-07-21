package Chapter_5;
class Employee{
    String name;
    double salary;
    static int count;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
        count++;
    }

    protected void finalize(){
        count--;
    }

    static int getCount(){
        return count;
    }


}

public class EmployeeTest {
    public static void main(String[] args){
        Employee e1 = new Employee("Kim", 10);
        Employee e2 = new Employee("Lee", 20);
        Employee e3 = new Employee("Park", 30);

        int n = Employee.getCount();

        System.out.println("현재의 직원수 = " + n);

    }
}
