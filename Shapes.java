import java.util.Scanner;

public class Shapes {

   public static int area(int length, int width) {
     return length * width;
   }

   public static double area(double radius) {
     return Math.PI * radius * radius;
   }

   public static double area(double base, double height) {
     return 0.5 * base * height;
   }

   public static int area(int side) {
     return side * side;
   }

   public static void main(String[] args) {
     Scanner myScanner = new Scanner(System.in);
   
     System.out.print("Enter the length of Rectangle:");
     int length = myScanner.nextInt();
     System.out.print("Enter the width of Rectangle:");
     int width = myScanner.nextInt();
     int rectarea = area(length, width);
     System.out.print("Area of Rectangle: " + rectarea);
     System.out.println();
   
     System.out.print("Enter the radius of Circle:");
     double radius = myScanner.nextDouble();
     double circlearea = area(radius);
     System.out.print("Area of Circle: " + circlearea);
     System.out.println();
   
     System.out.print("Enter the base of Triangle:");
     double base = myScanner.nextDouble();
     System.out.print("Enter the height of Triangle:");
     double height = myScanner.nextDouble();
     double triarea = area(base, height);
     System.out.print("Area of Triangle: " + triarea);
     System.out.println();
   
     System.out.print("Enter the side of a Square:");
     int side = myScanner.nextInt();
     int squarearea = area(side);
     System.out.print("Area of Square: " + squarearea);
   }
}

