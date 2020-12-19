import javax.swing.* ;
public class windowprime {
	public static void main(String[]args) {
		String inputStr;
		double n=1,count=0;
		int a=1;  
		inputStr = JOptionPane.showInputDialog("Input a number");
		n = Double.parseDouble(inputStr);
		
		
		if (n<=1) JOptionPane.showMessageDialog(null, "undefined");
		else {
		while(a<=n/2) {
			if (n%a==0) count=count+1 ;
			a++;
		}
		if(count==1) 
			JOptionPane.showMessageDialog(null, "N is a prime number");
		else 
			JOptionPane.showMessageDialog(null, "N is not a prime number");
		
		
	}

   }
  }

