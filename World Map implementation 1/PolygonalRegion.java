import java.util.LinkedList;
import java.awt.Graphics;
import java.awt.Color;
 
public class PolygonalRegion {
    private LinkedList<Point> points;
 
    public PolygonalRegion(LinkedList<Point> points){
        this.points = points;
    }
    public void setPoints(LinkedList<Point> points) {
        this.points = points;
    }
    public LinkedList<Point> getPoints(){
        return this.points;
    }
    public double getArea() { //Calculamos el área mediante el determinante
        double sum1 = points.get(points.size()-1).getX()*points.get(0).getY(); //xn*y0
        double sum2 = points.get(points.size()-1).getY()*points.get(0).getX(); //yn*x0
        for (int i=0;i<this.points.size()-1;i++) {
            sum1+= points.get(i).getX()*points.get(i+1).getY(); //xi*y(i+1)
            sum2+= points.get(i+1).getX()*points.get(i).getY(); //yi*x(i+1)
        }
        return 0.5*(sum1-sum2); //dividimos por 2 el determinante
    }

    /*public void draw(Graphics g){
        g.drawLine((int)points.get(points.size()-1).getX(),(int) points.get(points.size()-1).getY(),(int)points.get(0).getX(), (int)points.get(0).getY()); //dibujamos una línea entre el primer y último punto
        for(int i = 0;i < points.size()-1; i++){
            g.drawLine((int)points.get(i).getX(),(int) points.get(i).getY(),(int)points.get(i+1).getX(), (int)points.get(i+1).getY()); // dibujamos una línea entre todos los puntos consecutivos
        }
    }*/

    public void draw(Graphics g){
        int nPoints = points.size();
        int[] xPoints = new int[nPoints];
        int[] yPoints = new int[nPoints];
        
        for (int i = 0; i < nPoints; i++){
            xPoints[i] = (int) points.get(i).getX();
            yPoints[i] = (int) points.get(i).getY();
        }
        g.setColor(new Color(50,200,50));
        g.fillPolygon(xPoints, yPoints, nPoints);

    }
 
}
