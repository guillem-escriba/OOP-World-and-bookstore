
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class DrawPanel extends JPanel implements MouseListener{
	protected LinkedList< Entity > drawables;
	protected LinkedList< Entity > selection;
	private Object Entity;

	public DrawPanel() {
		this.drawables = new LinkedList< Entity >();
		this.selection = new LinkedList< Entity >(); 
		addMouseListener(this);
	}

	public void addDrawable( Entity entity ) {
		drawables.add( entity );
	}

	protected void paintComponent( Graphics g ) {
		super.paintComponent(g);
		for ( int i = 0; i < drawables.size(); ++i )
			drawables.get( i ).draw( g );
	}

	public void translate( int dx, int dy ) {
		for ( int i = 0; i < selection.size(); ++i ){
			selection.get(i).translate( dx, dy ); // Solo se trasladan las que han sido seleccionadas
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) { 
		Point p = new Point(e.getX(),e.getY()); // Se extrae el punyo donde se ha clicado
		for(Entity entity : drawables){ // Por cada entidad que se ha creado
			if(entity.isSelected(p)){ // Si se ha clicado
				selection.add(entity); // Se añade a seleccionados
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
