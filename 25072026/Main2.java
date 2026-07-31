import java.util.Scanner;

class Person {
    String name;
    int age;

    
}

class Student extends Person {
    int rollNo;
    String course;

    void displayDetails() {
        System.out.println("\n------Students Details-------");

        System.out.println(" Name: "+ name);
        System.out.println("Age: "+age);

        System.out.println("Roll Number: "+rollNo);

        System.out.println("Course:"+course);
        
    }

    
}
class Main2{

    public static void main(String[] args) {
        Student s = new Student();
        String name;
        int age;
        int rollNo;
        String course;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Course: ");
        course = sc.nextLine();
        s.displayDetails();
    }
}