import java.util.LinkedList;
import java.util.Arrays;
public class RectangularRegion extends PolygonalRegion{

    public RectangularRegion(Point p1, Point p3) {
        super(new LinkedList<Point>(Arrays.asList(p1, new Point(p3.getX(),p1.getY()), p3, new Point(p1.getX(),p3.getY())))); //convertimos los puntos en una linked list y llamamos al constructor de PolygonalRegion
    }

    @Override
    public double getArea() {
        return super.getArea();
    }
}