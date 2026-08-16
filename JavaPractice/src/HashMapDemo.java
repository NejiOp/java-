import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[]args){
        HashMap<Integer, String> students = new HashMap<>();
        //Add
        students.put(101, "Anurag");
        students.put(102, "Rahul");
        students.put(103, "Amit");
        System.out.println(students);

        //get
        System.out.println(students.get(101));

        //Search
        System.out.println(students.containsKey(102));
        //remove
        students.remove(103, "Amit");
        System.out.println(students.get(103));
        System.out.println(students);

        //update
        students.put(101, "Anurag Mishra");
        System.out.println(students);

        //keyset
        for(Integer id : students.keySet()){
            System.out.println(id);
        }

        //values
        for(String name: students.values()){
            System.out.println(name);
        }

        //entrySet()
        for(Map.Entry<Integer, String> entry: students.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
