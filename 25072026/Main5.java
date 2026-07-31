import java.util.Scanner;

class Person {
    String name;
    int age;

    void getPersonData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
    }
}

class Employee extends Person {
    int employeeId;
    double salary;

    void getEmployeeData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        employeeId = sc.nextInt();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }
}

class Manager extends Employee {
    String department;
    double bonus;

    void getManagerData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bonus: ");
        bonus = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Department: ");
        department = sc.nextLine();
    }

    void displayDetails() {
        System.out.println("\n------Manager Details------");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Salary : " + salary);
        System.out.println("Bonus : " + bonus);
        System.out.println("Department : " + department);
    }
}

public class Main5 {
    public static void main(String[] args) {
        Manager m = new Manager();

        m.getPersonData();
        m.getEmployeeData();
        m.getManagerData();

        m.displayDetails();
    }
}