package sphere;
import java.util.Scanner;

public class supersphere {
	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		double radius;
		double diameter;
		double circumference;
		double surface_area;
		double volume;
		System.out.print("radius:");
		radius = reader.nextDouble();
		diameter=2*radius;
		System.out.print("diameter:");
		System.out.println(diameter);
		circumference=2*radius*(Math.PI);
		System.out.print("circumference;");
		System.out.println(circumference);
		surface_area=4*(Math.PI)*(Math.pow(radius, 2));
		System.out.print("surface_area:");
		System.out.println(surface_area);
		volume=(4/3)*(Math.PI)*(Math.pow(radius, 3));
		System.out.print("volume:");
		System.out.println(volume);
	}

}
