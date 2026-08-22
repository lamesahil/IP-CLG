import java.util.Scanner;

class Rectangle {
    double length;
    double breadth;

    // Constructor
    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }
    double perimeter() {
        return 2 * (length + breadth);
    }
}

public class RectangleAct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        Rectangle rect = new Rectangle(l, b);
        while (true) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("1. Find Area");
            System.out.println("2. Find Perimeter");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Area of Rectangle is: " + rect.area());
                    break;
                case 2:
                    System.out.println("Perimeter of Rectangle is: " + rect.perimeter());
                    break;
                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return; 
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}