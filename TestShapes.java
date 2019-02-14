import java.applet.Applet;

import javax.swing.JFrame;


public class TestShapes extends Applet {

	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle();
		 JFrame frame = new JFrame("Rectangle");
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.add(rectangle);
		    frame.setSize(360, 300);
		    frame.setLocationRelativeTo(null);
		    frame.setVisible(true);
		    rectangle.repaint();
		    Cube cube=new Cube();
		  
	}

}

