package ifstatements;

public class Marriage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //WAP to validate eligibility for marriage(female:18 and male:21)
		int age =28;
		String gender="MALE";
		if(gender=="MALE") {
			if(age>=21) {
				System.out.println("Person with given age: "+age+" and gender:"+gender+" is eligible for Marriage");
			}
			else {
				System.out.println("Person with given age: "+age+" and gender:"+gender+" is NOT eligible for Marriage");
			}	
		}
		else {
			if(age>=18) {
				System.out.println("Person with given age: "+age+" and gender:"+gender+" is eligible for Marriage");
			}
			else {
				System.out.println("Person with given age: "+age+" and gender:"+gender+" is NOT eligible for Marriage");
			}	
			
		}
		
		
	}

}
