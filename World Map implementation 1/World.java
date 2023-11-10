import java.util.LinkedList;
import java.awt.Graphics;
import java.awt.Color;
 
 
public class World {
    private LinkedList<Continent> continents;
    private LinkedList<Ocean> oceans;
 
    public World(LinkedList<Continent> continents, LinkedList<Ocean> oceans){
        this.continents = continents;
        this.oceans = oceans;
    }
    public void setContinents(LinkedList<Continent> continents) {
        this.continents = continents;
    }
    public LinkedList<Continent> getContinents(){
        return this.continents;
    }

    public void setOceans(LinkedList<Ocean> oceans) {
        this.oceans = oceans;
    }
    public LinkedList<Ocean> getoceans(){
        return this.oceans;
    }
   
    public void draw(Graphics g){
        //Background
        g.setColor(new Color(50,50,255));
        g.fillRect(0, 0, 1000, 1000);

        for(int i = 0;i < continents.size(); i++){
            continents.get(i).draw(g);
        }

        for(int i = 0;i < oceans.size(); i++){
            oceans.get(i).draw(g);
        }
    }
}
 
