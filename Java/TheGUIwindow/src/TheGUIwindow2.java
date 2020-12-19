import javax.swing.*;
import java.awt.*;
public class TheGUIwindow2 {
	public static void main(String[]args) {
		JFrame TheGUI2 = new JFrame();
		TheGUI2.setTitle("Window 2020");
		TheGUI2.setSize(200, 300);
		TheGUI2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TheGUI2.setVisible(true);
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.GRAY);
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.BLUE);
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.RED);
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.ORANGE);
		Container pane = TheGUI2.getContentPane();
		pane.setLayout(new GridLayout(2,2));
		pane.add(panel1);
		pane.add(panel2);
		pane.add(panel3);
		pane.add(panel4);
		
	}

}
