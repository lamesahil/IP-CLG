
class Circle{
    int radius;
    public Circle(int r){
    this.radius = r;
    }
    public void area(){
        System.err.println("Circle with raidus " + this.radius);
        System.err.println("Area of Circle " + Math.PI * radius * radius );
    }
}
class CircleArea{
    public static void main(String[] args) {
        Circle obj1 = new Circle(5);
        obj1.area();
    }
}

// public class CircleArea {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.print("Enter the radius of the circle: ");
//         double radius = scanner.nextDouble();        
//         double area = Math.PI * radius * radius;
        
//         System.out.println("The area of the circle is: " + area);
        
//         scanner.close();
//     }
// }