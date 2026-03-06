class Car{
    String brand;
    int price;
}

class Employee{
    String name;
    int salary;

    void display(){
        System.out.println(name + " " + salary);
    }

    Employee(String n, int s){
        name = n;
        salary=s;
    }
}

public class Day8 {
    public static void main(String[] args){
        //Create class Car
        Car c1 = new Car();
        c1.brand = "BMW";
        c1.price = 2000000;
        System.out.println(c1.brand);
        System.out.println(c1.price);


//        //Create class Employee
//        Employee e1 = new Employee();
//        e1.name = "Anurag";
//        e1.salary=25000;
//        e1.display();

        // Use constructor in Employee
        Employee e2 = new Employee("Anurag", 30000);
    }
}
