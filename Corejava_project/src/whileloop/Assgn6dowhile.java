package whileloop;

public class Assgn6dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to display the below pattern using for loop
				//A B C 
				//D E F 
				//G H I
				int i=1;
				char ch = 'A';
				do {
			       int j=1;
					do {
						System.out.print(ch+" ");
						ch++;
						j++;
					}while(j<=3);
					System.out.println("");
					i++;
				}while(i<=3);
	}

}
