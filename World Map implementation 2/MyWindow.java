import java.awt.Color;
import java.util.LinkedList;

import javax.security.auth.callback.TextInputCallback;
public class MyWindow {

    public static void main( String[] args ) {
        java.awt.EventQueue.invokeLater( new Runnable() {
            public void run() {
                EntityDrawer drawer = new EntityDrawer();
                //northamerica
                Point p1 = new Point( 50, 50 ) ;
                Point p2 = new Point( 150, 50 ) ;
                Point p3 = new Point( 100, 200 ) ;
                TriangularRegion t1 = new TriangularRegion( p1,p2,p3 );
                drawer.addDrawable(t1);
                //southamerica
                Point p4 = new Point( 100, 200 ) ;
                Point p5 = new Point( 200, 200 ) ;
                Point p6 = new Point( 150, 350 ) ;
                TriangularRegion t2 = new TriangularRegion( p4,p5,p6 );
                drawer.addDrawable(t2);
                //africa
                LinkedList< Point > points = new LinkedList< Point >();
                points.add( new Point( 280, 200 ) );
                points.add( new Point( 380, 200 ) );
                points.add( new Point( 350, 300 ) );
                points.add( new Point( 310, 300 ) );
                PolygonalRegion r1 = new PolygonalRegion( points );
                drawer.addDrawable(r1);
                //europe       
                LinkedList< Point > points2 = new LinkedList< Point >();
                points2.add( new Point( 330, 50 ) );
                points2.add( new Point( 460, 50 ) );
                points2.add( new Point( 460, 130 ) );
                points2.add( new Point( 330, 130 ) );
                PolygonalRegion r2 = new PolygonalRegion( points2 );
                drawer.addDrawable(r2);
 
                LinkedList< Point > points3 = new LinkedList< Point >();
                points3.add( new Point( 290, 130 ) );
                points3.add( new Point( 330, 130 ) );
                points3.add( new Point( 330, 170 ) );
                points3.add( new Point( 290, 170 ) );
                PolygonalRegion r3 = new PolygonalRegion( points3 );
                drawer.addDrawable(r3);
      
                LinkedList< Point > points4 = new LinkedList< Point >();
                points4.add( new Point( 450, 300 ) );
                points4.add( new Point( 550, 300 ) );
                points4.add( new Point( 550, 350 ) );
                points4.add( new Point( 450, 350 ) );
                PolygonalRegion r4 = new PolygonalRegion( points4 );
                drawer.addDrawable(r4);

                Point p7 = new Point( 320, 350 ) ;
                CircularRegion c1 = new CircularRegion(p7, 80);
                drawer.addDrawable(c1);

                Point p8 = new Point( 100, 250 ) ;
                EllipsoidalRegion e1 = new EllipsoidalRegion(p8, 80, 40);
                e1.setFillColor(Color.RED);
                drawer.addDrawable(e1);

                Point p9 = new Point( 200, 220 ) ;
                Point p10 = new Point( 230, 250 ) ;
                RectangularRegion rect1 = new RectangularRegion(p9, p10);
                rect1.setFillColor(Color.ORANGE);
                drawer.addDrawable(rect1);
 

            }
        } );
    }

}


