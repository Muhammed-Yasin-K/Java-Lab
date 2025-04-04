import java.util.Scanner;

class Person {
    String name;
    String gender;
    String address;
    int age;

    Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    int empid;
    String compname;
    String qualification;
    String salary;

    Employee(String name, String gender, String address, int age, int empid, String compname, String qualification, String salary) {
        super(name, gender, address, age);
        this.empid = empid;
        this.compname = compname;
        this.qualification = qualification;
        this.salary = salary;
    }

    void displayEmp() {
        super.displayPerson();
        System.out.println("Employee ID: " + empid);
        System.out.println("Company Name: " + compname);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
    }
}

class Teacher extends Employee {
    String subject;
    String department;
    int tid;

    Teacher(String name, String gender, String address, int age, int empid, String compname, String qualification, String salary, String subject, String department, int tid) {
        super(name, gender, address, age, empid, compname, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.tid = tid;
    }

    void displayTeacher() {
        super.displayEmp();
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("Teacher ID: " + tid);
    }
}

public class Teach1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of teachers:");
        int n = sc.nextInt();
        sc.nextLine();  
        Teacher[] teachers = new Teacher[n];
        for (int i = 0; i < n; i++) {
            System.out.println("----------Enter Details Teacher " + (i + 1) + "------------");
            System.out.print("Enter the Name of Teacher: ");
            String name = sc.nextLine();
            System.out.print("Enter the Gender of Teacher: ");
            String gender = sc.nextLine();
            System.out.print("Enter the address of Teacher: ");
            String address = sc.nextLine();
            System.out.print("Enter the age of Teacher: ");
            int age = sc.nextInt();
            sc.nextLine();  
            System.out.print("Enter the empid of Teacher: ");
            int empid = sc.nextInt();
            sc.nextLine();  
            System.out.print("Enter the company name of Teacher: ");
            String compname = sc.nextLine();
            System.out.print("Enter the qualification of Teacher: ");
            String qualification = sc.nextLine();
            System.out.print("Enter the salary of Teacher: ");
            String salary = sc.nextLine();  
            System.out.print("Enter the subject of Teacher: ");
            String subject = sc.nextLine();
            System.out.print("Enter the department of Teacher: ");
            String department = sc.nextLine();
            System.out.print("Enter the Teacher ID: ");
            int tid = sc.nextInt();
            sc.nextLine();  
            teachers[i] = new Teacher(name, gender, address, age, empid, compname, qualification, salary, subject, department, tid);
            System.out.println("");
        }
        for (int i = 0; i < n; i++) {
            System.out.println("-------------Details of Teachers " + (i + 1) + "-------------");
            teachers[i].displayTeacher();
        }
    }
}


