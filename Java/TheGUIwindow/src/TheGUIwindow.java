import javax.swing.* ;
import java.awt.* ;
public class TheGUIwindow {
	public static void main (String[]args) {
		JFrame TheGUI = new JFrame();
		TheGUI.setTitle("WINDOWS xp");
		TheGUI.setSize(300, 300);
		TheGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TheGUI.setVisible(true);
		JPanel panel1= new JPanel();
		panel1.setBackground(Color.GREEN);
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.yellow);
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.blue);
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.pink);
		JPanel panel5 = new JPanel();
		panel5.setBackground(Color.white);
		Container pane = TheGUI.getContentPane();
		pane.add(panel1, BorderLayout.NORTH);
		pane.add(panel2, BorderLayout.SOUTH);
		pane.add(panel3, BorderLayout.WEST);
		pane.add(panel4, BorderLayout.EAST);
		pane.add(panel5, BorderLayout.CENTER);
				
		
		
		
		
		
		
		
		
	}
	

}
