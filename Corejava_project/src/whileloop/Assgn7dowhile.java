package whileloop;

public class Assgn7dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to display the below pattern using for loop
				//1
				//2 3
				//4 5 6
				int k=1,i=1;
				 do{
					int j=1;
					 do{
						System.out.print(k+" ");
						k++;
						if(i==j) {
				        break;
					    }
						j++;
					}while(j<=3);
					System.out.println("");
					i++;
				}while(i<=3);
	}

}
