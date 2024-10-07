package Test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Source.*;

class ShapeTest {

    @Test
    void testShapeComparator() {
        Shape rectangle = new Rectangle(1, 2, 3, 4);
        Shape square = new Square(5, 6, 7);
        ShapeComparator comparator = new ShapeComparator();
        assertTrue(comparator.compare(rectangle, square) < 0);
    }

    @Test
    void testRectangleAreaCalculate() {
        Rectangle rectangle = new Rectangle(1, 2, 3, 4);
        Assertions.assertEquals(12, rectangle.areaCalculate());
    }

    @Test
    void testSquareAreaCalculate() {
        Square square = new Square(5, 6, 7);
        Assertions.assertEquals(49, square.areaCalculate());
    }

    @Test
    void testCircleAreaCalculate() {
        Circle circle = new Circle(8, 9, 10);
        Assertions.assertEquals(314, circle.areaCalculate());
    }

    @Test
    void testGetCoordinates() {
        Shape shape = new Rectangle(1, 2, 3, 4);
        Assertions.assertEquals(1, shape.getXcordinate());
        Assertions.assertEquals(2, shape.getYcordinate());
    }


    @Test
    void testShapeConstructor() {
        Shape shape = new Rectangle(1, 2, 3, 4);
        Assertions.assertEquals(1, shape.getXcordinate());
        Assertions.assertEquals(2, shape.getYcordinate());
    }

    @Test
    void testShapeComparatorEqualShapes() {
        Shape square1 = new Square(5, 6, 7);
        Shape square2 = new Square(5, 6, 7);
        ShapeComparator comparator = new ShapeComparator();
        Assertions.assertEquals(0, comparator.compare(square1, square2));
    }

    @Test
    void testShapeComparatorEqualArea() {
        Shape square = new Square(5, 6, 7);
        Shape rectangle = new Rectangle(1, 2, 3, 4);
        ShapeComparator comparator = new ShapeComparator();
        assertTrue(comparator.compare(square, rectangle) > 0);
    }

    @Test
    void testShapeComparatorEqualAreaAndEqualX() {
        Shape square = new Square(5, 6, 7);
        Shape rectangle = new Rectangle(5, 2, 3, 4);
        ShapeComparator comparator = new ShapeComparator();
        assertTrue(comparator.compare(square, rectangle) > 0);
    }

    @Test
    void testShapeComparatorEqualAreaAndEqualXAndEqualY() {
        Shape square = new Square(5, 6, 7);
        Shape rectangle = new Rectangle(5, 6, 3, 4);
        ShapeComparator comparator = new ShapeComparator();
        assertTrue(comparator.compare(square, rectangle) > 0);
    }

}