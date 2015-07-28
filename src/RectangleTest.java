import static org.junit.Assert.*;

public class RectangleTest {


    @org.junit.Test
    public void testRectangleArea()
    {
        Rectangle rectangle=new Rectangle(10,12);
        assertEquals(120,rectangle.calculateArea(),1);
    }

    @org.junit.Test
    public void testRectanglePerimeter()
    {
        Rectangle rectangle=new Rectangle(10,12);
        assertEquals(22, rectangle.calculatePerimeter(),2);
    }




}