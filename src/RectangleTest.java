import static org.junit.Assert.*;

public class RectangleTest {

    @org.junit.Test
    public void testRectangleLength()
    {
        Rectangle rectangle=new Rectangle(10,12);

        assertEquals(10,rectangle.getLength());
    }

    @org.junit.Test
    public void testRectangleBreadth()
    {
        Rectangle rectangle=new Rectangle(10,12);

        assertEquals(10,rectangle.getBreadth());
    }
    @org.junit.Test
    public void testRectangleArea()
    {
        Rectangle rectangle=new Rectangle(10,12);

        assertEquals(120,rectangle.getArea());
    }



}