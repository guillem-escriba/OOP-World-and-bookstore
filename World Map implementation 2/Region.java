import java.awt.*;
 
abstract public class Region extends Entity {
    protected Color fillColor;
 
    public Region() {}
 
    abstract public double getArea();
 
    abstract public boolean isPointInside(Point p);
   
    public void setFillColor(Color c){
        this.fillColor = c;
    }
 
    public Color getFillColor() {
        return fillColor;
    }
}
