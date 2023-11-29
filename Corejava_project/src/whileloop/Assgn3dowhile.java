package whileloop;

public class Assgn3dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to display the below pattern using for loop
		//1 1 1 1
		//2 2 2 2
		//3 3 3 3
int i=1;
		 do{
			int j=1;
			do{
				System.out.print(i+" ");
				j++;
			}while(j<=4);
			System.out.println("");
			i++;
		}while(i<=3);
	}

}
