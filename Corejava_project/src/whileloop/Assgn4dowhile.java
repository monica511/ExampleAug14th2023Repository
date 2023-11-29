package whileloop;

public class Assgn4dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to display the below pattern using for loop
				//*
				//* *
				//* * *
				int i=1;
				do {
					int j=1;
					do {
						System.out.print("* ");
						if(j==i) {
							break;
						}
						j++;
					}while(j<=3);
					System.out.println("");
					i++;
				}while(i<=3);
	}

}
