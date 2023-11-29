package whileloop;

public class Assgn6while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to display the below pattern using for loop
		//A B C 
		//D E F 
		//G H I
		int k=0, i=1;
		while(i<=3) {
	       int j=1;
			while(j<=3) {
				System.out.print((char)(k+65)+" ");
				k++;
				j++;
			}
			System.out.println("");
			i++;
		}
	}

}
