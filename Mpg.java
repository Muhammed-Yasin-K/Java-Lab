import java.util.Scanner;

class Student {
  String name;
  int rollNo;
  String section;

   Student(String name,int rollNo,String section){
     this.name = name;
     this.rollNo = rollNo;
     this.section = section;  
   }
   
   void printDetails(){
   System.out.println("Student Name:"+this.name);
   System.out.println("Student RollNo:"+this.rollNo);
   System.out.println("Student Section:"+this.section); 
   }
}

public class Mpg {
  public static void main(String [] args) {
    Scanner myScanner = new Scanner(System.in);
    Student student[] = new Student[10];
    for(int i=0;i<5;i++){
    System.out.println("----------Enter Details of Student "+(i+1)+"------------");
    System.out.print("Enter the name of Student:");
    String name = myScanner.nextLine();
    
    System.out.print("Enter the rollno of Student:");
    int rollNo = myScanner.nextInt(); 
    
    System.out.print("Enter the section of Student:");
    String dummy = myScanner.nextLine();
    String section = myScanner.nextLine();
   
     
    student[i] = new Student(name,rollNo,section);
    System.out.println("--------------------------------------------------------");
    
    }
    
    for(int i=0;i<5;i++){
      System.out.println("-------------Details of Student "+(i+1)+"-------------");
      
      student[i].printDetails(); 
    }  
  }
}
