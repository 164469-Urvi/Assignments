import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class Rectangle extends Shapes{



@Override
public void paint(Graphics g ) {
	super.paintComponent(g);
	Graphics2D g2d=(Graphics2D)g;
	g2d.setColor(Color.RED);
	g2d.fillRect(10, 50, 100, 50);
	
	
}



}