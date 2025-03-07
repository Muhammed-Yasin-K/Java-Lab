import java.util.Scanner;

class Employee {
    int eNo;
    String eName;
    int eSalary;
    
    Employee( int eNo,String eName, int eSalary){
      this.eNo = eNo;
      this.eName = eName;
      this.eSalary = eSalary;
    }
    
    void printDetails(){
    System.out.println("Employee Number:"+this.eNo);
    System.out.println("Employee Name:"+this.eName);
    System.out.println("Employee Salary:"+this.eSalary);    
    }
}

public class Emp {
   public static void main(String [] args){
   Scanner myScanner = new Scanner(System.in);
   Employee employee[] = new Employee[5];
   for(int i=0;i<5;i++){
    System.out.println("----------Enter Details of Employee "+(i+1)+"------------");
    System.out.print("Enter the Number of Employee:");
    int eNo = myScanner.nextInt();
    
    System.out.print("Enter the Name of Employee:");
    String dummy = myScanner.nextLine();
    String eName = myScanner.nextLine();
    
    System.out.print("Enter the Salary of employee:");
    int eSalary = myScanner.nextInt();
    
    employee[i] = new Employee(eNo,eName,eSalary);
    System.out.println("");
}
    for(int i=0;i<5;i++){
      System.out.println("-------------Details of Student "+(i+1)+"-------------");
      employee[i].printDetails();
}
    System.out.println("----------------------------------------------")
    System.out.print("Enter the value to Search:");
    int val = myScanner.nextInt();
    boolean isFound = false;
    for(int i=0;i<5;i++){
      if(employee[i].eNo == val){
        System.out.println("");
        System.out.println("-------------------Search Employee Details--------------------");
        System.out.println("Employee Number:"+employee[i].eNo);
        System.out.println("Employee Name:"+employee[i].eName);
        System.out.println("Employee Salary:"+employee[i].eSalary);
        isFound = true;
        break;      
      }  
    }
    if(!isFound){
         System.out.println("Employee Not Found!");
    }
}
}
