class Employee {
    public double calculateSalary() {
        return 0.0; // Default implementation
    }
}

class Manager extends Employee {
    private double baseSalary = 60000;
    private double bonus = 20000;

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}

class Programmer extends Employee {
    private double baseSalary = 50000;
    private double overtimePay = 5000;

    @Override
    public double calculateSalary() {
        return baseSalary + overtimePay;
    }
}

public class EmployeeSalaryDemo {
    public static void main(String[] args) {
        Employee mgr = new Manager();
        Employee prog = new Programmer();

        System.out.println("Manager Salary: $" + mgr.calculateSalary());
        System.out.println("Programmer Salary: $" + prog.calculateSalary());
    }
}
