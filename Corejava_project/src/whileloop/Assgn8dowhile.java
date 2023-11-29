package whileloop;

public class Assgn8dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		do { 
                                  int j=1;
			 do{
			
			
				if((i+j)<=4) {
					System.out.print(" ");
					}
				else {
					System.out.print("* ");
				}
			
                                  j++;
			}while(j<=4);
			System.out.println();
            i++;
		    }while(i<=4);

	}

}
