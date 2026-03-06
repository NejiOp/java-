class Person{
    String name;
}

class Teacher extends Person{
    String subject;
}
public class Inheritance {
    public static void main(String[] args){
    Teacher t = new Teacher();
    t.name = "Anurag";
    t.subject = "English";
    System.out.println(t.name+ " " + t.subject);

    }
}
