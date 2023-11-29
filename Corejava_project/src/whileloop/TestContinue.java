package whileloop;

public class TestContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to run 10 times , once it reaches 5th iteration, skip the 5th and continue with remaining iteration.
				for(int i=1; i<=10; i++) {
				System.out.println("Inside the loop:"+i);
				
				if(i==5) {
					System.out.println("condition matched...");
					continue;
				}
				System.out.println("**************");
				}

	}

}
