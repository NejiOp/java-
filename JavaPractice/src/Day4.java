import java.util.Scanner;
public class Day4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Print 1–100

        for(int i = 1; i<=100; i++){
            System.out.println(i);
        }

        //Print even numbers 1–50

        for(int j = 2; j<=50; j+=2){
            System.out.println(j);
        }

        //Table of user number
        System.out.println("Enter Number");
        int a = scan.nextInt();
        for(int k = 1; k<=10; k++){
            System.out.println(a + "X" + k + "=" + (a*k));
        }

        //Pattern
        for(int l=1; l<=5; l++){
            for(int m=1; m<=l; m++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
