package whileloop;

public class Assgn6for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to display the below pattern using for loop
				//A B C 
				//D E F 
				//G H I
				int k=0;
				for(int i=1; i<=3; i++) {
			
					for(int j=1; j<=3; j++) {
						System.out.print((char)(k+65)+" ");
						k++;
					}
					System.out.println("");
				}
	}

}
