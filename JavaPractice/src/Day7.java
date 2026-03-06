import java.util.Scanner;

public class Day7 {

    public static void hello(){
        System.out.println("Hello");
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int square(int c){
        return c * c;
    }

    public static void even(int d){
        if(d % 2 == 0){
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }

    public static String reverse(String name){
        String rev = "";
        for(int i = name.length() - 1; i >= 0; i--){
            rev = rev + name.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        hello();

        System.out.println(add(5,5));
        System.out.println(square(5));

        even(7);

        String reversedName = reverse("Anurag");
        System.out.println(reversedName);
    }
}
