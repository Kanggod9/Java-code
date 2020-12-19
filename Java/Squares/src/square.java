import javax.swing.*;
import java.awt.* ;
public class square {
	public static void main (String[]args){
		JFrame graph = new JFrame();
		   graph.setSize(300, 300);
		   graph.setVisible(true);
		   Container pane = graph.getContentPane();
		   pane.setLayout(new GridLayout(8,8));
		   Color firstbackcolor = Color.black;
		   int i=1,n=1;
		   for(;i<=8;i++) {
			   Color backcolor = firstbackcolor;
			   
			   for(;n<=8;n++) {
			   ColorPanel panel = new ColorPanel(backcolor);
			   pane.add(panel);
			   if(backcolor == Color.red) backcolor=Color.black;
			   else backcolor = Color.red;
			   
		        }
			   if(firstbackcolor == Color.red) firstbackcolor = Color.black;
			   else firstbackcolor = Color.red;
		   
		 }  
		   
	}

}
class ColorPanel extends JPanel{
	public ColorPanel (Color backcolor) {
		this.setBackground(backcolor);
	}
}
