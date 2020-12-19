
public class animal {
	public static void main(String[]args) {
		Animalclassification dogs = new Animalclassification("hello","world");
		System.out.println(dogs.name);
	}

}



class Animalclassification{
	protected String name;
	protected String species;
	public Animalclassification() {
		
	}
	public Animalclassification(String name,String species){
		this.name = name;
		this.species = species;
	}
}