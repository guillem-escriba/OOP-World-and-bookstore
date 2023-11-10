import java.awt.Graphics;

public class GeoPoint extends Point {
    private String name;

    public GeoPoint( double xi, double yi, String n) {
        super(xi,yi);
        name = n;
    }
    public String getName(){
        return name;
    }

    public void draw(Graphics g){
        g.drawString(name, (int)super.getX(), (int)super.getY());
    }
}
