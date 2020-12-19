import java.util.Scanner;
public class boyHEIGHT {
	public static void main(String[]args) {
		Scanner reader = new Scanner(System.in);
		double motherheight ;
		double fatherheight ;
		double boyheight ;
		double girlheight ;
		System.out.print("Enter number fatherheight:");
		fatherheight = reader.nextDouble();
		System.out.print("Enter number motherheight:");
		motherheight = reader.nextDouble();
		boyheight =(fatherheight+motherheight)*1.115/2;
		girlheight=(fatherheight*0.964+motherheight)/2;
		System.out.print("The perdiction in boyheight is ");
		System.out.println(boyheight);
		System.out.print("The perdiction in girlheight is ");
		System.out.println(girlheight);
		
	}
	

}
