package whileloop;

public class Assgn8for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to display the below pattern using for loop
				//     *
				//    * *
				//   * * *
		        //  * * * *
		        // * * * * *
				int space=5;
				for(int i=1; i<=5; i++) { 
					for(int j=1; j<=9; j++) {
						System.out.print(" ");
					
						if(space==j) {
							for(int star=1;star<=i;star++) {
							System.out.print("* ");
							}
							break;
					    }
					}
					System.out.println();
					space--;
				}
	}

}
