import java.util.LinkedList;
import java.util.Arrays;
public class TriangularRegion extends PolygonalRegion{

    public TriangularRegion(Point p1, Point p2, Point p3) {
        super(new LinkedList<Point>(Arrays.asList(p1, p2, p3))); //convertimos los puntos en una linked list y llamamos al constructor de PolygonalRegion
    }
    @Override
    public double getArea() {
        return super.getArea();
    }
}