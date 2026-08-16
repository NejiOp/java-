import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[]args){
//        HashMap<Integer, String> students = new HashMap<>();
//        //Add
//        students.put(101, "Anurag");
//        students.put(102, "Rahul");
//        students.put(103, "Amit");
//        System.out.println(students);
//
//        //get
//        System.out.println(students.get(101));
//
//        //Search
//        System.out.println(students.containsKey(102));
//        //remove
//        students.remove(103, "Amit");
//        System.out.println(students.get(103));
//        System.out.println(students);
//
//        //update
//        students.put(101, "Anurag Mishra");
//        System.out.println(students);
//
//        //keyset
//        for(Integer id : students.keySet()){
//            System.out.println(id);
//        }
//
//        //values
//        for(String name: students.values()){
//            System.out.println(name);
//        }
//
//        //entrySet()
//        for(Map.Entry<Integer, String> entry: students.entrySet()){
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }


        //Employee
        HashMap<Integer, Employee> employees = new HashMap<>();
        employees.put(101, new Employee(101, "Anurag", 25000));
        employees.put(102, new Employee(102, "Anurag", 25000));
        employees.put(103, new Employee(103, "Anurag", 25000));

        for(Map.Entry<Integer, Employee> entry: employees.entrySet()){
            System.out.println(entry.getKey() +" : "+ entry.getValue());
        }

        System.out.println(employees.get(102));
        System.out.println(employees.containsKey(105));
        employees.remove(103);
        for(Map.Entry<Integer, Employee> entry: employees.entrySet()){
            System.out.println(entry.getKey() +" : "+ entry.getValue());
        }
    }
}
