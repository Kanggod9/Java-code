import java.util.Scanner ;
public class PI {
	public static void main(String[]args) {
		Scanner reader = new Scanner(System.in);
		double fraction,n;	
		double a=1 ,b=1,box=0;
		int i=1;
		n= reader.nextDouble();
		
		while(i<=n) {
			fraction = a/b;
			box=box+fraction;
			if(b>=0) b=-(b+2);
			else b=-b+2 ;
			i++;
			
		}
		System.out.print(box*4);
	}

}
