import java.util.ArrayList;
import java.util.Scanner;
public class EmployeeManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Anurag", 25000));
        employees.add(new Employee(102, "Rahul", 30000));
        employees.add(new Employee(103, "Amit", 35000));

        while (true) {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            // Use switch(choice) here

            switch (choice) {
                case 1:
                    addEmployee(employees, sc);
                    System.out.println("\nUpdated Employee List");
                    viewEmployees(employees);
                    break;
                case 2:
                    viewEmployees(employees);
                    break;
                case 3:
                    searchEmployee(employees, sc);
                    break;
                case 4:
                    updateSalary(employees, sc);
                    System.out.println("\nUpdated Employee Salary");
                    viewEmployees(employees);
                    break;
                case 5:
                    deleteEmployee(employees, sc);
                    viewEmployees(employees);
                    break;
                case 6:
                    System.out.println("Thank you");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }


    //Add employee data
    public static void addEmployee(ArrayList<Employee> employees, Scanner sc) {

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        for(Employee emp : employees){
            if(emp.getId() == id){
                System.out.println("Employee ID already exists.");
                return;
            }
        }

        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, salary);
        employees.add(emp);
        System.out.println("Employee added successfully.");

    }
    public static void viewEmployees(ArrayList<Employee> employees){

        if(employees.isEmpty()){
            System.out.println("No employees found.");
            return;
        }

        for(Employee emp : employees){
            System.out.println(emp);
        }
    }

    //Search

    public static void searchEmployee(ArrayList<Employee> employees, Scanner sc) {

        System.out.print("Enter Employee ID to Search: ");
        int id = sc.nextInt();

        boolean found = false;

        for (Employee emp : employees) {

            if (emp.getId() == id) {
                System.out.println(emp);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found.");
        }
    }
// Update
    public static void updateSalary(ArrayList<Employee> employees, Scanner sc){
        System.out.print("Enter ID to update salary: ");
        int id = sc.nextInt();
        boolean found = false;

        for (Employee emp : employees) {

            if (emp.getId() == id) {
                System.out.print("Enter new Salary: ");
                double salary = sc.nextDouble();
                emp.setSalary(salary);
                found = true;
                System.out.println("Salary updated successfully.");
                break;
            }
        }
        if(!found){
            System.out.println("Employee not found.");
        }
    }

    // delete

    public static void deleteEmployee(ArrayList<Employee> employees, Scanner sc){
        System.out.print("Enter ID to delete employee: ");
        int id = sc.nextInt();
        boolean found=false;
        for (int i = 0; i < employees.size(); i++){

            if (employees.get(i).getId() == id){
                employees.remove(i);
                System.out.println("Employee deleted successfully.");
                found = true;
                break;
            }

        }
        if(!found){
            System.out.println("Employee not found.");
        }
    }

}

