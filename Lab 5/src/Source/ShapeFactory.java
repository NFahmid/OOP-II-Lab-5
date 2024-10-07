package Source;

public class ShapeFactory {
    public static Shape createCircle(int xcordinate, int ycordinate, int radius){
        return new Circle(xcordinate, ycordinate, radius);
    }
    public static Shape createRectangle(int xcordinate, int ycordinate, int width, int height){
        return new Rectangle(xcordinate, ycordinate, width, height);
    }
    public static Shape createSquare(int xcordinate, int ycordinate, int side){
        return new Square(xcordinate, ycordinate, side);
    }
}
