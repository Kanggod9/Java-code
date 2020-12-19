import java.util.Scanner;
public class Calculator {
	public static void main(String [] args) {
		//three constants
		final double flat_tax_rate  = 0.2 ;
		final double Standard_deduction = 10000;
		final double dependent_deduction =2000;
		
		Scanner reader = new Scanner (System.in);
		double gross_income ;
		int    numeber_of_dependents;
		double income_tax;
		
		System.out.print("Enter the gross income:");
		gross_income = reader.nextDouble();
		System.out.print("Enter the number_of_dependents:");
		numeber_of_dependents = reader.nextInt();
		income_tax= (gross_income - Standard_deduction - dependent_deduction*numeber_of_dependents)*flat_tax_rate;
		System.out.print("The income tax is");
		System.out.println(income_tax);
		
		
				
		
	}

}
