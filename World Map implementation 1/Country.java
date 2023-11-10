import java.util.LinkedList;
import java.awt.Graphics;
import java.awt.Color;

public class Country extends PolygonalRegion {
    private String name;
    private LinkedList<City> cities;
    private LinkedList<Country> neighbors;
    private City capital;

    public Country(LinkedList<Point> points, City cap) {
        super(points);
        this.capital = cap;
        cities =  new LinkedList< City >(); //inicializamos la lista de ciudades
        cities.add(cap); //Añadimos la capital a la lista de ciudades
    }

    public void addCity(City c){
        cities.add(c);
    }

    public void addNeighbor(Country c){
        neighbors.add(c);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCapital(City capital) {
        this.capital = capital;
    }
    public void setCities(LinkedList<City> cities) {
        this.cities = cities;
    }
    public void setNeighbors(LinkedList<Country> neighbors) {
        this.neighbors = neighbors;
    }

    public void draw(Graphics g){
        super.draw(g);
        g.setColor(new Color(255,255,255));
        for(int i = 0;i < cities.size(); i++){
            cities.get(i).draw(g);
        }
    }
}
