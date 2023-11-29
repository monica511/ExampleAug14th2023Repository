package whileloop;

public class Assgn4for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to display the below pattern using for loop
				//*
				//* *
				//* * *
				for(int i=1; i<=3; i++) {
					
					for(int j=1; j<=3; j++) {
						System.out.print("* ");
						if(j==i) {
							break;
						}
					}
					System.out.println("");
				}
	}

}
