abstract class Vehicle{
    abstract void start();
    void fuel(){
        System.out.println("Vehicle needs fuel");
    }
}

class Caar extends Vehicle{
    void start(){
        System.out.println("Car starts with key");
    }
}

public class Day13 {
    public static void main(String[] args){
        Vehicle v;
v = new Caar();
v.start();
v.fuel();
}
    }

