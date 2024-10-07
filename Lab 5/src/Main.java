public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        OrderPrinter orderPrinter = new OrderPrinter();
        orderPrinter.addShape(shapeFactory.createRectangle(1, 2, 3, 4));
        orderPrinter.addShape(shapeFactory.createSquare(5, 6, 7));
        orderPrinter.addShape(shapeFactory.createCircle(8, 9, 10));
        orderPrinter.addShape(shapeFactory.createRectangle(11, 12, 13, 14));
        orderPrinter.addShape(shapeFactory.createSquare(15, 16, 17));
        orderPrinter.addShape(shapeFactory.createSquare(17, 16, 17));
        orderPrinter.addShape(shapeFactory.createCircle(18, 19, 20));
        orderPrinter.addShape(shapeFactory.createCircle(18, 23, 20));
        orderPrinter.orderShapes();
        orderPrinter.printShapes();
    }
}