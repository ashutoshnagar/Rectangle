import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
      

        ShapeFactory factory=new ShapeFactory();
        Shape shape;
        Scanner scanner=new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Circle");
            System.out.println("2. Square");
            System.out.println("3. Rectangle");
            System.out.println("4. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the radius of circle");
                    double radius = scanner.nextDouble();

                    shape = factory.createCircle(radius);
                    System.out.println("Area of Circle  " + shape.calculateArea());
                    System.out.println("Perimeter of Circle  " + shape.calculatePerimeter());
                    break;
                case 2:
                    System.out.println("Enter the side of square");
                    double side = scanner.nextDouble();

                    shape = factory.createSquare(side);
                    System.out.println("Area of Square  " + shape.calculateArea());
                    System.out.println("Perimeter of Square  " + shape.calculatePerimeter());
                    break;
                case 3:
                    System.out.println("Enter the length of rectangle");
                    double length = scanner.nextDouble();
                    System.out.println("Enter the breadth of rectangle");
                    double breadth = scanner.nextDouble();

                    shape = factory.createRectangle(length, breadth);
                    System.out.println("Area of Rectangle  " + shape.calculateArea());
                    System.out.println("Perimeter of Rectangle  " + shape.calculatePerimeter());
                    break;
                case 4:
                    System.exit(1);
                default:
                    System.exit(1);
            }

        }while (true);
    }
}
