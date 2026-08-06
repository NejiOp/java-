import java.util.Scanner;

class InvalidSalaryException extends Exception{
    public InvalidSalaryException(String message){
        super(message); /* We use super Because the parent class (Exception) already stores the message.
                        super(message) passes our custom message to the parent exception.*/
    }
}

class InvalidAgeException extends Exception{
        public InvalidAgeException(String message){
            super(message);
        }
}


public class Custom_Exception {

//Check Salary
    static void checkSalary(double salary) throws InvalidSalaryException{
        if(salary<0){
            throw new InvalidSalaryException("Salary cannot be negative");
        }
        System.out.println("Salary Accepted");
    }

// Check Age

static void checkAge(double age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age must be 18 or above.");
        }
    System.out.println("Eligible to vote");
}

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

//Salary
        System.out.println("Enter Salary");
        double salary = sc.nextDouble();
        try{

            checkSalary(salary);

        }
        catch(InvalidSalaryException e){

            System.out.println(e.getMessage());

        }

//Age

        System.out.println("Enter Age");
        int age = sc.nextInt();

        try{
            checkAge(age);
        }   catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }

    }
}
