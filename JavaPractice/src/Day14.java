interface Annimal{
    void sound();
}

class Doog implements Annimal{
    @Override
    public void sound(){
        System.out.println("Barks");
    }
}

class Caat implements Annimal{
    @Override
    public void sound(){
        System.out.println("Meows");
    }
}

public class Day14 {
    public static void main(String[] args){
Annimal a;
a = new Doog();
a.sound();
a = new Caat();
a.sound();
    }
}
