package whileloop;

public class Assgn5for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to display the below pattern using for loop
		//* * *
		//* *
		//* 
		
		for(int i=1; i<=3; i++) {
			int k=3;
			for(int j=1; j<=3; j++) {
				System.out.print("* ");
				if(k==i) {
		        break;
			    }
				k--;
			}
			System.out.println("");
		}
	}

}
