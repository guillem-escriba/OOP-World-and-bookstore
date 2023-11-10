import java.util.LinkedList;

public class Lake {
    private LinkedList<Country> countries;
    private double x,y;
    public Lake(LinkedList<Country> c, int x, int y) {
        countries = c;
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }
 
    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setCountries(LinkedList<Country> countries) {
        this.countries = countries;
    }
}
