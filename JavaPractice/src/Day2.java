import java.util.Scanner;
public class Day2 {
    public static void main(String[] args) {
        String a;
        Scanner scan = new Scanner(System.in);
        //Name input
        System.out.println("Enter Your User name");
        a = scan.next();
        System.out.println("Hello " + a);

        //Sum of 2 number
        int b, c;
        System.out.println("Enter num 1");
        b = scan.nextInt();
        System.out.println("Enter num 2");
        c = scan.nextInt();
        int d = b + c;
        System.out.println("Sum " + d);

        //find Area of circle
        int r;
        System.out.println("Enter radius");
        r = scan.nextInt();
        double area;
        area = 3.14 * r * r;
        System.out.println("Area of circle " + area);

        //Find even/odd
        int num;
        System.out.println("Enter Number");
        num = scan.nextInt();
        if(num % 2 == 0){
            System.out.println("Even number");
        }else {
            System.out.println(num + " is Odd");
        }
        // Find largest number
        int num1, num2;
        System.out.print("Enter first number: ");
        num1 = scan.nextInt();

        System.out.print("Enter second number: ");
        num2 = scan.nextInt();

        if(num1 > num2){
            System.out.println(num1 + " is the largest");
        }else if(num1 < num2){
            System.out.println(num2 + " is the largest");
        }else {
            System.out.println("Both are same");
        }

        //Age
        int age;
        System.out.print("Enter your age: ");
        age = scan.nextInt();
        if(age < 18){
                System.out.println("Minor");
        }else if(age >= 18 && age < 60){
            System.out.println("Adult");
        }else{
            System.out.println(" Senior");
        }
    }




}
