public class MainClass {
    public static void main(String[] args) {
        Shape rectangle=new Rectangle(10,20);
        System.out.println("Area of Rectangle  "+rectangle.calculateArea());
        System.out.println("Perimeter of Rectangle  " + rectangle.calculatePerimeter());

        Shape square=new Square(10);
        System.out.println("Area of Square  "+square.calculateArea());
        System.out.println("Perimeter of Square  " + square.calculatePerimeter());

        Shape circle=new Circle(10);
        System.out.println("Area of Circle  "+circle.calculateArea());
        System.out.println("Perimeter of Circle  " + circle.calculatePerimeter());

    }
}
