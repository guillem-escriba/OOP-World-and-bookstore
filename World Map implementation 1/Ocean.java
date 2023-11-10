import java.util.LinkedList;
import java.awt.Graphics;

public class Ocean{
    private LinkedList<Continent> continents;
    private LinkedList<Ocean> oceans;
    private GeoPoint coordinates;

    public Ocean( LinkedList<Continent> continents, LinkedList<Ocean> oceans,  GeoPoint coordinates ){
        this.oceans = oceans;
        this.continents = continents;
        this.coordinates = coordinates;
    }

    public LinkedList<Continent> getContinents(){
        return continents;
    }

    public LinkedList<Ocean> getOceans(){
        return oceans;
    }

    public void setContinents(LinkedList<Continent> continents) {
        this.continents = continents;
    }

    public void setOceans(LinkedList<Ocean> oceans) {
        this.oceans = oceans;
    }

    public void draw(Graphics g){
        g.drawString(coordinates.getName(),(int) coordinates.getX(), (int)coordinates.getY());
    }
}

    /*public double computeCentralAxis(LinkedList<Point> points){
        // Calcular eje central de cada pais para diferenciar los puntos del este de los del oeste.
        double central_axis = 0.0;
        for (int k = 0; k < points.size();k++){
            Point p1 = points.get(k);
            for (int l = k+1; l < points.size(); l++){
                Point p2 = points.get(l);
                double aux = Math.abs(p1.getX()-p2.getX())/2;
                if(p1.getX()>p2.getX()){
                    aux += p2.getX(); 
                }else{
                    aux += p1.getX();
                }
                if (central_axis < aux){
                    central_axis = aux;
                }
            }
        }
        return central_axis;
    }   
    public LinkedList<Point> commonPoints(LinkedList<Point> ps1, LinkedList<Point> ps2){
        LinkedList<Point> common_points = new LinkedList<Point>();
        for(int i = 0; i < ps1.size(); i++){
            for(int j = 0; j < ps2.size(); j++){
                if(ps1.get(i).getX()==ps2.get(j).getX() && ps1.get(i).getY()==ps2.get(j).getY()){
                    common_points.add(ps1.get(i));
                }
            }
        }
        return common_points; 
    }

    public void draw(Graphics g){
        for (int i = 0; i < continents.size(); i++){
            LinkedList<Country> countries = continents.get(i).getcountries();
            
            for (int j = 0; j < countries.size(); j++){
                LinkedList<Point> points = countries.get(j).getPoints();
                double central_axis = computeCentralAxis(points);
                LinkedList<Point> west = new LinkedList<Point>();
                LinkedList<Point> east = new LinkedList<Point>();
                for (int k = 0; k < points.size(); k++){
                    Point p = points.get(k);
                    if(p.getX()<central_axis){
                        west.add(p);
                    }else{
                        east.add(p);
                    }
                }

                }
                

            }

        } */