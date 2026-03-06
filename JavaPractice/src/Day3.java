import java.util.Scanner;
public class Day3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Positive / Negative Number
        int a;
        System.out.println("Enter number");
        a = scan.nextInt();
        if(a>0){
            System.out.println(a + " Number is Positive");
        } else if (a<0) {
            System.out.println(a + " Number is negative");
        }else {
            System.out.println("Number is Zero");
        }

        //Greatest of 3 Numbers
        int b, c, d;
        System.out.println("Enter value of b");
        b = scan.nextInt();
        System.out.println("Enter value of c");
        c = scan.nextInt();
        System.out.println("Enter value of d");
        d = scan.nextInt();
        if(b>c && b>d){
            System.out.println(b +" is largest");
        }else if(c>b && c>d){
            System.out.println(c +" is largest");
        }else{
            System.out.println(d +" is largest");
        }

        //Leap Year Program
        System.out.println("Enter year");
        int year = scan.nextInt();
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + "  is Leap year");
        }else{
            System.out.println(year + "  is not a Leap year");
        }
        // Marks Grading System
        System.out.println("Enter Percentage of Student");
        int marks = scan.nextInt();
        if(marks >= 90){
            System.out.println("A Grade");
        }
        else if(marks >= 70){
            System.out.println("B Grade");
        }
        else if(marks >= 50){
            System.out.println("C Grade");
        }
        else{
            System.out.println("Fail");
        }


        //Simple Calculator
        int first, second;
        System.out.println("Enter first number");
        first = scan.nextInt();
        System.out.println("Enter operator (+, -, *, /)");
        String operator = scan.next();
        System.out.println("Enter Second number");
        second = scan.nextInt();
        if(operator.equals("+")){
            System.out.println(first + second);
        }else if(operator.equals("-")){
            System.out.println(first - second);
        }else if(operator.equals("/")){
            System.out.println(first / second);
        }else if(operator.equals("*")){
            System.out.println(first * second);
        }
        else{
            System.out.println("enter proper operator");
        }

        //Salary Category Challenge
        System.out.println("Enter your salary");
        int salary = scan.nextInt();
        if(salary<20000){
            System.out.println("Low income");
        } else if (salary>=20000 && salary<=50000) {
            System.out.println("Medium income");
        }else {
            System.out.println("High Salary");
        }

    }
}
