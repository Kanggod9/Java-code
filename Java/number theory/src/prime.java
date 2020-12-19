import java.util.Scanner;
public class prime {
	public static void main(String[]args) { 
		double n;
		Scanner reader = new Scanner(System.in);
		System.out.print("Number:");
		n = reader.nextDouble();
		int count=0;
		int a=1;
		if (n<=1)   System.out.print("undefined");
		else {
		while(a<=n/2) {
			if (n%a!=0) ;
			else count=count+1 ;
			a++;
		}
		if (count==1) {
			System.out.print("N is prime");
		           }
		else System.out.print("N is not prime");
		}
		

	}
}

