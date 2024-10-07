import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    @Test
    void testAddShape() {
        OrderPrinter orderPrinter = new OrderPrinter();
        Shape rectangle = new Rectangle(1, 2, 3, 4);
        orderPrinter.addShape(rectangle);
        assertEquals(1, orderPrinter.shapes.size());
        assertEquals(rectangle, orderPrinter.shapes.get(0));
    }

    @Test
    void testShapeComparator() {
        Shape rectangle = new Rectangle(1, 2, 3, 4);
        Shape square = new Square(5, 6, 7);
        ShapeComparator comparator = new ShapeComparator();
        assertTrue(comparator.compare(rectangle, square) < 0);
    }

    @Test
    void testOrderShapes() {
        OrderPrinter orderPrinter = new OrderPrinter();
        orderPrinter.addShape(new Rectangle(1, 2, 3, 4));
        orderPrinter.addShape(new Square(5, 6, 7));
        orderPrinter.orderShapes();
        assertTrue(orderPrinter.shapes.get(0) instanceof Rectangle);
        assertTrue(orderPrinter.shapes.get(1) instanceof Square);
    }

    @Test
    void testPrintShapes() {
        OrderPrinter orderPrinter = new OrderPrinter();
        orderPrinter.addShape(new Rectangle(1, 2, 3, 4));
        orderPrinter.addShape(new Square(5, 6, 7));
        orderPrinter.printShapes();
    }

    @Test
    void testRectangleAreaCalculate() {
        Rectangle rectangle = new Rectangle(1, 2, 3, 4);
        assertEquals(12, rectangle.areaCalculate());
    }

    @Test
    void testSquareAreaCalculate() {
        Square square = new Square(5, 6, 7);
        assertEquals(49, square.areaCalculate());
    }

    @Test
    void testCircleAreaCalculate() {
        Circle circle = new Circle(8, 9, 10);
        assertEquals(314, circle.areaCalculate());
    }

    @Test
    void testGetCoordinates() {
        Shape shape = new Rectangle(1, 2, 3, 4);
        assertEquals(1, shape.getXcordinate());
        assertEquals(2, shape.getYcordinate());
    }


    @Test
    void testShapeConstructor() {
        Shape shape = new Rectangle(1, 2, 3, 4);
        assertEquals(1, shape.getXcordinate());
        assertEquals(2, shape.getYcordinate());
    }

    @Test
    void testShapeComparatorEqualShapes() {
        Shape square1 = new Square(5, 6, 7);
        Shape square2 = new Square(5, 6, 7);
        ShapeComparator comparator = new ShapeComparator();
        assertEquals(0, comparator.compare(square1, square2));
    }

    @Test
    void testShapeComparatorEqualArea() {
        Shape square = new Square(5, 6, 7);
        Shape rectangle = new Rectangle(1, 2, 3, 4);
        ShapeComparator comparator = new ShapeComparator();
        assertTrue(comparator.compare(square, rectangle) > 0);
    }
    
}