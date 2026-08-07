import java.util.HashSet;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> skills = new HashSet<>();
        skills.add("Java");
        skills.add("Spring Boot");
        skills.add("React");
        skills.add("MySQL");
        skills.add("Java");
        skills.add("React");
        System.out.println(skills);
        System.out.println(skills.size());
        System.out.println(skills.contains("React"));
        skills.remove("MySQL");
        System.out.println(skills);
    }
}
