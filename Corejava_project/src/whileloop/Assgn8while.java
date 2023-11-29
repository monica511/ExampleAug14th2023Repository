package whileloop;

public class Assgn8while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to display the below pattern using for loop
		//     *
		//    * *
		//   * * *
        //  * * * *
        // * * * * *
		int space=5,i=1;
		while(i<=5) { 
                                  int j=1;
			while(j<=9) {
				System.out.print(" ");
			
				if(space==j) {
					for(int star=1;star<=i;star++) {
					System.out.print("* ");
					}
					break;
			         }
                                  j++;
			}
			System.out.println();
			space--;
            i++;
		    }
		}
	}
