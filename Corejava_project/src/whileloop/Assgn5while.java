package whileloop;

public class Assgn5while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to display the below pattern using for loop
				//* * *
				//* *
				//* 
				int i=1;
				while(i<=3) {
					int k=3, j=1;
					while(j<=3) {
						System.out.print("* ");
						if(k==i) {
				        break;
					    }
						k--;
						j++;
					}
					System.out.println("");
					i++;
				}
	}

}
