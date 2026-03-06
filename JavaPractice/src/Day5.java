import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Store 5 numbers
        int arr[] = {25,20,15,10,5};

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        // Input array
        int num[] = new int[5];

        System.out.println("Enter 5 numbers:");
        for(int i=0; i<num.length; i++){
            num[i] = scan.nextInt();
        }

        // Print array
        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }

        // Sum
        int sum = 0;
        for(int i=0; i<num.length; i++){
            sum += num[i];
        }
        System.out.println("Sum = " + sum);

        // Largest
        int max = num[0];
        for(int i=1; i<num.length; i++){
            if(num[i] > max){
                max = num[i];
            }
        }
        System.out.println("Largest = " + max);

        // Smallest
        int min = num[0];
        for(int i=1; i<num.length; i++){
            if(num[i] < min){
                min = num[i];
            }
        }
        System.out.println("Smallest = " + min);
    }
}
