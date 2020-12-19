
public class division {
	public static void main(String[]args) {
		double a,b,i,box ,t;
		a=2 ;
		b=1;
		box=0;
		int n;
		n=1;
		while (n<=6)  {
			i=a/b;
			box=box+i;
			t=b;
			b=a;
			a=a+t;
			n++;
			
			
			
		}
				
		System.out.print(box);
	} 
	

}
