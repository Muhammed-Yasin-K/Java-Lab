import java.util.Scanner;

public class Matrix {
   public static void main(String []args) {
      Scanner myObj = new Scanner (System.in);
      System.out.println("Enter the number of rows:");
      int row = myObj.nextInt();
      System.out.println("Enter the number of columns:");
      int col = myObj.nextInt();
      
      int m1[][] = new int[row][col];
      int m2[][] = new int[row][col];
      int m3[][] = new int[row][col];
      
      System.out.println("Enter the elements of first matrix:");
        for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
               m1[i][j] = myObj.nextInt(); 
        }     
      }
        
         
      System.out.println("Enter the elements of second matrix:");
        for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
               m2[i][j] = myObj.nextInt(); 
        }     
      }
        
   
       for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
               m3[i][j] =  m1[i][j] + m2[i][j]; 
         }     
        } 
        
        System.out.println("Addition of two matrix:");
         for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
               System.out.print(m3[i][j] + "\t");
        } 
        System.out.println();    
        } 
        
            
    }
      
   
}

