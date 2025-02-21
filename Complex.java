import java.util.Scanner;

public class Complex {
  public static void main(String []args) {
  Scanner myObj = new Scanner(System.in);
  System.out.println("Enter the real part of complex number 1:");
  int real1 = myObj.nextInt();
  System.out.println("Enter the imaginary part of complex number 1:");
  int imag1 = myObj.nextInt();
  
  System.out.println("Enter the real part of complex number 2:");
  int real2 = myObj.nextInt();
  System.out.println("Enter the imaginary part of complex number 2:");
  int imag2 = myObj.nextInt();
  
  System.out.println("First complex number = "+real1+ "+" +imag1+"i");
  System.out.println("Second complex number = "+real2+ "+" +imag2+"i");
  
  int real = real1+real2;
  int imag = imag1+imag2;
  System.out.println("Addition of Two complex Number = "+real+ "+" +imag+"i");
  
  } 


}

 
