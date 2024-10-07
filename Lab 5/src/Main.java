import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(shapeFactory.createCircle(0, 0, 5));
        shapes.add(shapeFactory.createRectangle(1, 2, 3, 4));
        shapes.add(shapeFactory.createSquare(5, 6, 7));
        shapes.add(shapeFactory.createCircle(8, 9, 10));
        shapes.add(shapeFactory.createCircle(10, 9, 10));
        shapes.add(shapeFactory.createRectangle(11, 12, 13, 14));
        shapes.add(shapeFactory.createRectangle(11, 1, 13, 14));
        shapes.add(shapeFactory.createSquare(15, 16, 17));
        shapes.add(shapeFactory.createSquare(15, 16, 17));
        OrderPrinter orderPrinter = new OrderPrinter(shapes);
        orderPrinter.orderShapes();
        orderPrinter.printShapes();
    }
}