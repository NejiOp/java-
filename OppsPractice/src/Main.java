//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Class & Object

class Student{
    String name;
    int marks;
    Student( String n, int m){
        name = n;
        marks = m;
    }
}

public class Main {
    public static void main(String[] args) {
 //object 1

Student s1 = new Student("Anurag", 80);

//object 2

        Student s2 = new Student("Harsh", 90);
        System.out.println(s1.name + " " + s1.marks);
        System.out.println(s2.name + " " + s2.marks);
    }
}