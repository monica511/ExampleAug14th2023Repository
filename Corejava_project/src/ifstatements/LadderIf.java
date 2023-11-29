package ifstatements;

public class LadderIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to check the colour code
		String colorCode= "green";
		if(colorCode=="white") {
		System.out.println("The "+colorCode+" colour indicates pure and clean");	
		}
		else if(colorCode=="yellow") {
		System.out.println("The "+colorCode+" colour indicates joy and happiness ");		
		}
		else if(colorCode=="pink") {
			System.out.println("The "+colorCode+" colour indicates feminine and kindness  ");	
		}
		else if(colorCode=="red") {
			System.out.println("The "+colorCode+" colour indicates hatred and anger ");	
		}
		else if(colorCode=="green") {
			System.out.println("The "+colorCode+" colour indicates growth ,energy and freshness ");	
		}
		else {
			System.out.println("Invalid input/colour");
		}

	}

}
