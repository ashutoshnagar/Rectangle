public class Circle implements Shape {
    public final double PI=3.14;
    private double radius;

    public Circle(double radius)
    {
        this.radius=radius;
    }
    @Override
    public double calculateArea() {
        return PI*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*PI*radius;
    }
}
