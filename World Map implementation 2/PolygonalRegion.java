import java.util.LinkedList;
import java.awt.Graphics;
import java.awt.Color;
 
public class PolygonalRegion extends Region {
    protected LinkedList<Point> points;
 
    public PolygonalRegion(LinkedList<Point> points){
        this.points = points;
        this.fillColor = new Color(50,200,50);
        this.lineColor = Color.BLACK;
    }
    public void setPoints(LinkedList<Point> points) {
        this.points = points;
    }
    public LinkedList<Point> getPoints(){
        return this.points;
    }
    @Override
    public double getArea() { //Calculamos el área mediante el determinante
        double sum1 = points.get(points.size()-1).getX()*points.get(0).getY(); //xn*y0
        double sum2 = points.get(points.size()-1).getY()*points.get(0).getX(); //yn*x0
        for (int i=0;i<this.points.size()-1;i++) {
            sum1+= points.get(i).getX()*points.get(i+1).getY(); //xi*y(i+1)
            sum2+= points.get(i+1).getX()*points.get(i).getY(); //yi*x(i+1)
        }
        return 0.5*(sum1-sum2); //dividimos por 2 el determinante
    }
    @Override
    public void draw(Graphics g){
        int nPoints = points.size();
        int[] xPoints = new int[nPoints];
        int[] yPoints = new int[nPoints];
        
        for (int i = 0; i < nPoints; i++){
            xPoints[i] = (int) points.get(i).getX();
            yPoints[i] = (int) points.get(i).getY();
        }
        g.setColor(fillColor);
        g.fillPolygon(xPoints, yPoints, nPoints);
        g.setColor(lineColor);
        g.drawPolygon(xPoints, yPoints, nPoints);
    }
    @Override
    public void translate(int dx, int dy){
        for(int i = 0;i < points.size(); i++){
            points.get(i).move(dx,dy); //Desplazamos cada punto de la región
        }
    }
    @Override
    public boolean isPointInside(Point p){
        int sign;
        int sign2;
        Vector q1q2 = points.get(points.size()-1).difference(points.get(0)); //Vector Q2-Q1 para el último punto de la región
        Vector q1p = points.get(points.size()-1).difference(p); //Vector P-Q1 para el último punto de la región
        double cross = q1q2.crossProduct(q1p);
        if (cross>0) {sign = 1;} else{ sign = -1;} //Atribuímos 1 o -1 para saber el signo
        for(int i = 0;i < points.size()-1; i++){
            q1q2 = points.get(i).difference(points.get(i+1)); //Vector Q2-Q1 para cada par de puntos
            q1p = points.get(i).difference(p); //Vector P-Q1
            cross = q1q2.crossProduct(q1p);
            if (cross>0) {sign2=1;} else {sign2=-1;}
            if (sign != sign2){return false;} //si algún signo no coincide retornamos false
        }
        return true; //si todos los signos coinciden retornamos true
    }

    @Override
    public boolean isSelected(Point p) {
        if (isPointInside(p)){
            return true;
        }
        return false;
    }
 
}
