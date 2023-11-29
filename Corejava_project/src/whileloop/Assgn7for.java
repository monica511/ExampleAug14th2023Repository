package whileloop;

public class Assgn7for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to display the below pattern using for loop
				//1
				//2 3
				//4 5 6
				int k=1;
				for(int i=1; i<=3; i++) {
					for(int j=1; j<=3; j++) {
						System.out.print(k+" ");
						k++;
						if(i==j) {
				        break;
					    }
					}
					System.out.println("");
				}
	}

}
