import java.util.Collections;
import java.util.ArrayList;

public class OrderPrinter {
    ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public void orderShapes(){
        Collections.sort(shapes, new ShapeComparator());
    }

    public void printShapes(){
        for(Shape shape: shapes){
            System.out.println(shape.getClass().getName() + "\tArea: " + shape.areaCalculate() + "\tX cordinate: " + shape.getXcordinate() + "\tY cordinate: " + shape.getYcordinate());
        }
    }
}