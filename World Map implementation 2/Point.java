
public class Point {
    private double x,y;
 
    public Point( double initX, double initY) {
        x = initX;
        y = initY;
    }
   
    public double getX() {
        return x;
    }
 
    public double getY() {
        return y;
    }
 
 
    public void setX(float newX) {
        x = newX;
    }
 
    public void setY(double newY) {
        y = newY;
    }

    public void move(double Xdistance, double Ydistance){
        x +=Xdistance;
        y +=Ydistance;
    }

    public Vector difference(Point p2){
        Vector diff = new Vector(p2.getX()-x,p2.getY()-y); //retornamos como vector la diferencia de ambos puntos
        return diff;
    }
 
}