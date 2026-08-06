import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();

list.add("Java");
list.add("Python");
list.add("React");
list.set(1, "JS");

//list.remove(1);          // Removes "Python"
list.remove("React");    // Removes by value

System.out.println(list);
}}