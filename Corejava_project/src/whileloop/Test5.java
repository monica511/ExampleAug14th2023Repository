package whileloop;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//WAP to run 10 times , once it reaches 5th iteration, execution should stop.
		for(int i=1; i<=10; i++) {
		System.out.println("Inside the loop:"+i);
		
		if(i==5) {
			System.out.println("condition matched...");
			break;
		}
		System.out.println("**************");
		}
	}

}
