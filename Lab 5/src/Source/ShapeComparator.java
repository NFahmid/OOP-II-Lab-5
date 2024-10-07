package Source;

import java.util.Comparator;

public class ShapeComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape s1, Shape s2) {
        int areaComparison = Integer.compare(s1.areaCalculate(), s2.areaCalculate());
        if (areaComparison != 0) {
            return areaComparison;
        }
        int xComparison = Integer.compare(s1.getXcordinate(), s2.getXcordinate());
        if (xComparison != 0) {
            return xComparison;
        }
        return Integer.compare(s1.getYcordinate(), s2.getYcordinate());
    }
}