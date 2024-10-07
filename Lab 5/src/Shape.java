abstract class Shape {
    private int xcordinate;
    private int ycordinate;

    public Shape(int xcordinate, int ycordinate){
        this.xcordinate = xcordinate;
        this.ycordinate = ycordinate;
    }

    public abstract int areaCalculate();

    public int getXcordinate(){
        return xcordinate;
    }

    public int getYcordinate(){
        return ycordinate;
    }
}
