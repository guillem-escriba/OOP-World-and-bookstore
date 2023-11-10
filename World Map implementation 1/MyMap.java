import java.util.LinkedList;
 
public class MyMap extends javax.swing.JPanel {
 
    private World world;
 
    public MyMap() {
        initComponents();
       
        //Country1 from america
        LinkedList< Point > points1 = new LinkedList< Point >();
        points1.add( new Point( 100, 100 ) );
        points1.add( new Point( 300, 100 ) );
        points1.add( new Point( 200, 500 ) );
        
        
        City washington = new City(185,250,"Washington", 690000);
        Country northamerica = new Country(points1,washington);

        LinkedList< Country > americancountries = new LinkedList< Country >();
        americancountries.add(northamerica);

        Lake gradndeslagos = new Lake(americancountries,220,170);
        LinkedList< Lake > americanlakes = new LinkedList< Lake >();
        americanlakes.add(gradndeslagos);

        //Country2 from america
        LinkedList< Point > points2 = new LinkedList< Point >();
        points2.add( new Point( 200, 500 ) );
        points2.add( new Point( 400, 500 ) );
        points2.add( new Point( 300, 900 ) );

        City brasilia = new City(300,700,"Brasilia", 2500000);
        Country southamerica = new Country(points2,brasilia);
       
        
        americancountries.add(southamerica);
 
        Continent america = new Continent(americancountries,americanlakes);
 
        //Country1 from euroasia
        LinkedList< Point > points3 = new LinkedList< Point >();
        points3.add( new Point( 500, 300 ) );
        points3.add( new Point( 600, 300 ) );
        points3.add( new Point( 600, 400 ) );
        points3.add( new Point( 500, 400 ) );
        
        City madrid = new City(530,350,"Madrid", 3200000);
        Country spain = new Country(points3,madrid);

        LinkedList< Country > eurasiancountries = new LinkedList< Country >();
        eurasiancountries.add(spain);

        Lake lagodicomo = new Lake(eurasiancountries,575,305);
        LinkedList< Lake > eurasianlakes = new LinkedList< Lake >();
        eurasianlakes.add(lagodicomo);
       
        //Country2 from euroasia
        LinkedList< Point > points4 = new LinkedList< Point >();
        points4.add( new Point( 600, 100 ) );
        points4.add( new Point( 900, 100 ) );
        points4.add( new Point( 900, 300 ) );
        points4.add( new Point( 600, 300 ) );
        
        City moscow = new City(700,220,"Moscow", 11200000);
        Country russia = new Country(points4,moscow);
        eurasiancountries.add(russia);
 
        Continent euroasia = new Continent(eurasiancountries,eurasianlakes);
        
        //Region1 from africa
        LinkedList< Point > points5 = new LinkedList< Point >();
        points5.add( new Point( 500, 500 ) );
        points5.add( new Point( 800, 500 ) );
        points5.add( new Point( 700, 800 ) );
        points5.add( new Point( 600, 800 ) );
        
 
        City kinshasa = new City(650,700,"Kinshasa", 17070000);
        Country congo = new Country(points5,kinshasa);

        LinkedList< Country > africancountries = new LinkedList< Country >();
        africancountries.add(congo);

        Lake vittoria = new Lake(africancountries,720,640);
        LinkedList< Lake > africanlakes = new LinkedList< Lake >();
        africanlakes.add(vittoria);
 
        Continent africa = new Continent(africancountries,africanlakes);

        //Region1 from Oceania
        LinkedList< Point > points6 = new LinkedList< Point >();
        points6.add( new Point( 750, 850 ) );
        points6.add( new Point( 950, 850 ) );
        points6.add( new Point( 950, 950 ) );
        points6.add( new Point( 750, 950 ) );
        
        City canberra = new City(880,930,"Canberra", 400000);
        Country australia = new Country(points6,canberra);

        LinkedList< Country > oceaniancountries = new LinkedList< Country >();
        oceaniancountries.add(australia); 

        Lake eyre = new Lake(oceaniancountries,880,890);
        LinkedList< Lake > oceanianlakes = new LinkedList< Lake >();
        oceanianlakes.add(eyre);

        Continent oceania = new Continent(oceaniancountries,oceanianlakes);
 
        //World
        LinkedList< Continent > continents = new LinkedList< Continent >();
        continents.add(america);
        continents.add(euroasia);
        continents.add(africa);
        continents.add(oceania);
       


        // Init oceans
        LinkedList< Ocean > adjoceans = new LinkedList< Ocean >();
        

        // Pacific Ocean
        LinkedList< Continent > adjContinents1 = new LinkedList< Continent >();
        adjContinents1.add(america);
        adjContinents1.add(euroasia);
        adjContinents1.add(africa);
        adjContinents1.add(oceania);

        GeoPoint coordinates1 = new GeoPoint(50, 500, "Pacific Ocean");

        Ocean pacificOcean = new Ocean(adjContinents1, adjoceans, coordinates1);

        // Atlantic Ocean
        LinkedList< Continent > adjContinents2 = new LinkedList< Continent >();
        adjContinents2.add(america);
        adjContinents2.add(euroasia);
        adjContinents2.add(africa);

        GeoPoint coordinates2 = new GeoPoint(350, 400, "Atlantic Ocean");

        Ocean atlanticOcean = new Ocean(adjContinents2, adjoceans, coordinates2);
        
        // Indic Ocean
        LinkedList< Continent > adjContinents3 = new LinkedList< Continent >();
        adjContinents3.add(euroasia);
        adjContinents3.add(africa);
        adjContinents3.add(oceania);

        GeoPoint coordinates3 = new GeoPoint(750, 400, "Indic Ocean");

        Ocean indicOcean = new Ocean(adjContinents3, adjoceans, coordinates3);
        
        //Add adjacent oceans
        adjoceans.add(pacificOcean);
        adjoceans.add(indicOcean);
        adjoceans.add(atlanticOcean);

        pacificOcean.setOceans(adjoceans);
        indicOcean.setOceans(adjoceans);
        atlanticOcean.setOceans(adjoceans);
        


        // World oceans
        LinkedList< Ocean > oceans = new LinkedList< Ocean >();
        oceans.add(pacificOcean);
        oceans.add(indicOcean);
        oceans.add(atlanticOcean);
        
        world = new World(continents,oceans);
 
        System.out.println( america.getTotalArea() +euroasia.getTotalArea() +africa.getTotalArea() +oceania.getTotalArea() );
    }
 
    private void initComponents() {
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
    }
 
    public void paint( java.awt.Graphics g ) {
        super.paint( g );
        world.draw( g );
    }
}