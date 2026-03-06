import java.util.Scanner;
public class Day6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //Take name input and print it
        System.out.println("Enter your name");
        String name = scan.nextLine();
        System.out.println("name is: " + name);

        //Find length of string
        System.out.println("Length is: " + name.length());

        //Convert string to uppercase
        String upper = name.toUpperCase();
        System.out.println(upper);

        //Compare two names
        System.out.println("Enter your name2");
         String name2 = scan.nextLine();
        System.out.println("Are both names equal: " + name.equals(name2));

        //Reverse string
        String reverse = "";
       for(int i = name.length() - 1; i >= 0; i--){
           reverse = reverse + name.charAt(i);

       }
        System.out.println("Reversed string: " + reverse);
       //Palindrome
        if (name.equalsIgnoreCase(reverse)){
            System.out.println("Palindrome");
        }else {
            System.out.println("not Palindrome");
        }
    }
}
