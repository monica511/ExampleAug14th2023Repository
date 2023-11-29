package corejava;

public class NoOfChar {
	 public static int findlength(String str){
		  int count=0;
		     for (char ch:str.toCharArray()){
		      count++;
		     }
		    return count;
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length= findlength("Testing");
		System.out.println("Length of the given string is: "+length);
	}

}
