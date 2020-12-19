 import javax.swing.* ;
import java.awt.*;
public class iamge {
	public static void main (String[]args) {
		JFrame TheGUI = new JFrame();
		TheGUI.setTitle("WINDOWS xp");
		TheGUI.setSize(300, 300);
		TheGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TheGUI.setVisible(true);
		
	    ColorPanel panel = new ColorPanel(Color.white);
	    Container pane = TheGUI.getContentPane();
	    pane.add(panel);
	   
	}
	
}
	
	
	class ColorPanel extends JPanel{
		public  ColorPanel(Color background ) {
		   setBackground(background);
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.black);
		int[]a = {240,220,240};
		int[]b = {30,50,70};
		int[]c = {420,440,420};
		int[]d = {30,50,70};
		g.drawPolyline(a, b, 3);
		g.drawPolyline(c, d, 3);
		g.drawLine(220, 50, 440, 50);
		int[]e = {200,220,200};
		int[]f = {180,200,220};
		int[]h = {460,440,460};
		int[]i = {180,200,220};
		g.drawPolyline(e, f, 3);
		g.drawPolyline(h, i, 3);
		g.drawLine(220, 200, 440, 200);
		
	}
	
	
	}


