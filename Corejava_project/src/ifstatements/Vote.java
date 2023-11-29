package ifstatements;

public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //WAP to validate person's age for voting
		int age=25;
		if(age>=18&&age<=100) {
			System.out.println("Person with given age: "+age+" is eligible for voting");
		}
		else {
			System.out.println("Person with given age: "+age+" is NOT eligible for voting");
		}
	}

}
