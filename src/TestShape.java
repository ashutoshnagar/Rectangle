
import org.junit.Test;

import static org.junit.Assert.*;

public class TestShape {




    @Test
    public void testCalculateArea() throws Exception {
        Rectangle rectangle=new Rectangle(10,12);
        Square square=new Square(10);
        Circle circle=new Circle(10);

        assertEquals(120,rectangle.calculateArea(),1);
        assertEquals(100,square.calculateArea(),1);
        assertEquals(314,circle.calculateArea(),1);

    }

    @Test
    public void testCalculatePerimeter() throws Exception {
        Rectangle rectangle=new Rectangle(10,12);
        Square square=new Square(10);
        Circle circle=new Circle(10);

        assertEquals(44,rectangle.calculatePerimeter(),1);
        assertEquals(40,square.calculatePerimeter(),1);
        assertEquals(62.8,circle.calculatePerimeter(),1);
    }
}