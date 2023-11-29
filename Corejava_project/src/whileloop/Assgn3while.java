package whileloop;

public class Assgn3while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to display the below pattern using for loop
				//1 1 1 1
				//2 2 2 2
				//3 3 3 3
		int i=1;
				while(i<=3) {
					int j=1;
					while(j<=4) {
						System.out.print(i+" ");
						j++;
					}
					System.out.println("");
					i++;
				}
	}

}
