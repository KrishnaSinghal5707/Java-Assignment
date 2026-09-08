import java.io.*;
import java.util.Scanner;

class Employee {
    private int empNo;
    private String empName;
    private int empBasic;

    public Employee(int empNo, String empName, int empBasic) {
        this.empNo = empNo;
        this.empName = empName;
        this.empBasic = empBasic;
    }

    public int getEmpNo() { return empNo; }
    public String getEmpName() { return empName; }
    public int getEmpBasic() { return empBasic; }
}

public class WriteEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Number: ");
        int no = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        int basic = sc.nextInt();

        Employee emp = new Employee(no, name, basic);
        File file = new File("emp.txt");

        // Write to file
        try (FileWriter fw = new FileWriter(file)) {
            fw.write(emp.getEmpNo() + "\n");
            fw.write(emp.getEmpName() + "\n");
            fw.write(emp.getEmpBasic() + "\n");
            System.out.println("\nEmployee details saved to emp.txt successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Read from file and display
        System.out.println("\n--- Reading from File ---");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            System.out.println("Employee Number: " + br.readLine());
            System.out.println("Employee Name: " + br.readLine());
            System.out.println("Basic Salary: " + br.readLine());
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        
        sc.close();
    }
}
