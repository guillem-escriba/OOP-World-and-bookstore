import java.awt.Graphics;
import java.awt.Color;

public class EllipsoidalRegion extends Region{
    protected Point c;
    protected double r1,r2; 


    EllipsoidalRegion(Point c, double r1, double r2){
        this.c = c;
        this.r1 = r1;
        this.r2 = r2;
        this.fillColor = Color.BLUE;
        this.lineColor = Color.BLACK;
    }

    @Override
    public double getArea() {
        return Math.PI*r1*r2; // Cálcula del area
    }

    @Override
    public boolean isPointInside(Point p) {
        double px = p.getX(); 
        double py = p.getY();
        double cx = c.getX();
        double cy = c.getY();
        double a = r1;
        double b = r2;
        if( ((Math.pow(px-cx, 2)/Math.pow(a, 2)) + (Math.pow(py-cy, 2)/Math.pow(b, 2))) <= 1 ){ // Con esta inecuación se puede saber si un punto está dentro de una elipse
            return true;
        }
        return false;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(fillColor); // Se establece el color
        g.fillOval((int) c.getX(), (int) c.getY() ,(int) r1,(int) r2); // Se pinta el interior
        g.setColor(lineColor); // Se establece el color de la línea
        g.drawOval((int) c.getX(), (int) c.getY() ,(int) r1,(int) r2); // Se dibuja la línea
        
    }


    @Override
    public void translate(int dx, int dy) { 
        c.move(dx,dy); // Se desplaza un incremento de x y de y
    }

    @Override
    public boolean isSelected(Point p) {
        if (isPointInside(p)){ // Si el punto está dentro, isSelected es True, es decir que se selecciona
            return true;
        }
        return false;
    }
    
    // Sets & gets
    public Point getC() {
        return c;
    }
    public double getR1() {
        return r1;
    }
    public double getR2() {
        return r2;
    }

    public void setC(Point c) {
        this.c = c;
    }
    public void setR1(double r1) {
        this.r1 = r1;
    }
    public void setR2(double r2) {
        this.r2 = r2;
    }


}