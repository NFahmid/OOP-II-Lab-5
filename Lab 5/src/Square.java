public class Square extends Shape{
    private int side;

    public Square(int xcordinate, int ycordinate, int side){
        super(xcordinate, ycordinate);
        this.side = side;
    }

    public int areaCalculate(){
        return side * side;
    }
}
