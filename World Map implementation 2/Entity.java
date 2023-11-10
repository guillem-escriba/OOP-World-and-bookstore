
import java.awt.*;

abstract public class Entity {
	protected Color lineColor;

	public Entity() {}

	abstract public void draw( java.awt.Graphics g );

	abstract public void translate( int dx, int dy );

	abstract public boolean isSelected(Point p);
	
	public void setColor(Color c){
		this.lineColor = c;
	}

	public Color getLineColor() {
		return lineColor;
	}
}