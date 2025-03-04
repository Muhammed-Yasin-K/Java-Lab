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
   System.out.println("---------------------------------");
   
   }
}

public class Mprg {
  public static void main(String [] args) {
    Student student1 = new Student("Wissam",1,"XI B");
    Student student2 = new Student("Yasin",2,"XI B");
    Student student3 = new Student("Suhaid",3,"XI A");
    
    student1.printDetails();
    student2.printDetails();
    student3.printDetails();  
  }
}
