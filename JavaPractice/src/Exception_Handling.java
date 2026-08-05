public class Exception_Handling {
    public static void main(String[] args) {

//Arithmetic Exception
        try{
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {  //e is an object containing information about the exception.
            System.out.println(e);
            System.out.println("____________________________________________________________");
        }

//NullPointerException

        try{
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("String is null.");
            System.out.println("____________________________________________________________");
        }

 // ArithmeticException with multiple catch
        try {

            int arr [] = {1,2,3};

            System.out.println(arr[5]);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error");
            System.out.println("____________________________________________________________");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Error");
            System.out.println("____________________________________________________________");
        }finally {
            System.out.println("Array Index Closed");
        }

//Exception

        try {

            int a = 10 / 0;

        } catch (Exception e) { // This catches almost every exception.

            System.out.println("Something went wrong.");

        } finally {
            System.out.println("finally Block"); // finally always executes, whether an exception occurs or not.
            System.out.println("____________________________________________________________");
        }

//We can use try without catch but at the place of catch we have to use finally.
        try {
            System.out.println("Hello");
        } finally {
            System.out.println("Done");
            System.out.println("____________________________________________________________");
        }
        System.out.println("Program continues...");
    }
}
