package whileloop;

public class Assgn7while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to display the below pattern using for loop
		//1
		//2 3
		//4 5 6
		int k=1,i=1;
		while(i<=3) {
			int j=1;
			while(j<=3) {
				System.out.print(k+" ");
				k++;
				if(i==j) {
		        break;
			    }
				j++;
			}
			System.out.println("");
			i++;
		}
	}

}
