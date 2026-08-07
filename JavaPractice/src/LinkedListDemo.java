import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String [] args){
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Spring Boot");
        list.add("React");
        list.add("MySQL");
        System.out.println(list);
        list.remove("React");
        list.add("Angular");
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

    }
}
