class Students{
    private String name;
    private int marks;

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }

    public void setMarks(int m){
        if (m>=0){
            marks = m;
        }else{
            System.out.println("Enter valid marks");
        }

    }
    public int getMarks(){
        return marks;
    }
}

public class encapsulation {
    public static void main(String[] args){
Students s = new Students();
s.setName("Anurag");
s.setMarks(90);
System.out.println(s.getName());
System.out.println(s.getMarks());
    }
}
