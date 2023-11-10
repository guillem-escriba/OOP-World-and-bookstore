import java.util.LinkedList;
import java.awt.Color;
import java.awt.Graphics;
 
public class Continent {
    private LinkedList<Country> countries;
    private LinkedList<Lake> lakes;
 
    public Continent(LinkedList<Country> c, LinkedList<Lake> l){
        this.countries = c;
        this.lakes = l;
    }
    
    public LinkedList<Country> getcountries(){
        return this.countries;
    }

    public LinkedList<Lake> getlakes(){
        return this.lakes;
    }

    public double getTotalArea() {
        double area = 0;
        for(int i = 0;i < countries.size(); i++){
            area += countries.get(i).getArea();
        }
        return area;
    }
    public void setLakes(LinkedList<Lake> lakes) {
        this.lakes = lakes;
    }
    public void setCountries(LinkedList<Country> countries) {
        this.countries = countries;
    }
   
    public void draw(Graphics g){
        for(int i = 0;i < countries.size(); i++){
            countries.get(i).draw(g);
        }
        g.setColor(new Color(51,204,255));
        for(int i = 0;i < lakes.size(); i++){
            g.fillOval((int)lakes.get(i).getX(), (int)lakes.get(i).getY(), 20, 20);
        }
        g.setColor(Color.black);
    }
}
