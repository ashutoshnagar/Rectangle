public class ShapeFactory {

    public static Circle createCircle(double radius)
    {
        return new Circle(radius);
    }

    public static Rectangle createRectangle(double length,double breadth)
    {
        return new Rectangle(length,breadth);
    }

    public static Square createSquare(double side)
    {
        return new Square(side);
    }

}
