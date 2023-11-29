package whileloop;

public class Assgn5dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to display the below pattern using for loop
		//* * *
		//* *
		//* 
		int i=1;
		 do{
			int j=1;
			do {
				System.out.print("* ");
				j++;
			}while(j<=i);
			System.out.println("");
			i--;
		}while(i>=1);
	}

}
