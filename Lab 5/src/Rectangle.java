public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(int xcordinate, int ycordinate, int width, int height){
        super(xcordinate, ycordinate);
        this.width = width;
        this.height = height;
    }

    public int areaCalculate(){
        return width * height;
    }
}
