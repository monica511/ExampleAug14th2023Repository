package whileloop;

public class Assgn4while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to display the below pattern using for loop
		//*
		//* *
		//* * *
		int i=1;
		while(i<=3) {
			int j=1;
			while(j<=3) {
				System.out.print("* ");
				if(j==i) {
					break;
				}
				j++;
			}
			System.out.println("");
			i++;
		}
	}

}
