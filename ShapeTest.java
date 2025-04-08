import java.util.Scanner;

interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    double length, width;

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1/2/3): ");
            
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter the radius of the Circle: ");
                circle.radius = scanner.nextDouble();  
                System.out.println("Area: " + circle.area());
                System.out.println("Perimeter: " + circle.perimeter());
            } else if (choice == 2) {
                System.out.print("Enter the length of the Rectangle: ");
                rectangle.length = scanner.nextDouble();  
                System.out.print("Enter the width of the Rectangle: ");
                rectangle.width = scanner.nextDouble(); 
                System.out.println("Perimeter: " + rectangle.perimeter());
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice! Try again.");
            }
        }

        scanner.close();
    }
}

