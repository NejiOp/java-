//Method overriding

class Shape{
    void draw(){
        System.out.println("Drawing shape");
    }
}
class Circle extends Shape{
    @Override
void draw(){
    System.out.println("Drawing circle");
}
}
class Rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing rectangle");
    }
}
public class Day11 {
    public static void main(String[] args){
Circle c = new Circle();
Rectangle r = new Rectangle();
c.draw();
r.draw();
    }
}
