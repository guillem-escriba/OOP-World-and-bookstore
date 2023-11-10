public class Vector {
    private double vx,vy;
 
    public Vector( double initVx, double initVy) {
        vx = initVx;
        vy = initVy;
    }
   
    public double getVx() {
        return vx;
    }
 
    public double getVy() {
        return vy;
    }
 
 
    public void setVx(float newVx) {
        vx = newVx;
    }
 
    public void setVy(float newVy) {
        vy = newVy;
    }

    public double crossProduct(Vector v2){
        return vx*v2.getVy() -vy*v2.getVx();
    }
 
}