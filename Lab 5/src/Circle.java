public class Circle extends Shape{
    private int radius;

    public Circle(int xcordinate, int ycordinate, int radius){
        super(xcordinate, ycordinate);
        this.radius = radius;
    }

    public int areaCalculate(){
        return (int)(Math.PI * radius * radius);
    }
}
