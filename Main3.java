class PersonDetails {
    String name = "Harshitha";
    int age = 18;

    void displayPerson() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

class EmployeeDetails extends PersonDetails {
    int employeeId = 6607;
    double salary = 30000;

    void displayEmployee() {
        displayPerson();
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Salary      : " + salary);
    }
}

class ManagerDetails extends EmployeeDetails {
    double bonus = 5000;
    String department = "HR";

    void displayManager() {
        displayEmployee();
        System.out.println("Bonus       : " + bonus);
        System.out.println("Department  : " + department);
    }
}

public class Main3 {
    public static void main(String[] args) {
        ManagerDetails m = new ManagerDetails();
        m.displayManager();
    }
}