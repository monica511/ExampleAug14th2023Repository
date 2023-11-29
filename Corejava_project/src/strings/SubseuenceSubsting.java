package strings;

public class SubseuenceSubsting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   extractString("BANGALORE is a garden city");
	}
public static void extractString(String str) {
	String res = str.substring(5);
	System.out.println(res);
	
	res=str.substring(15, 21);
	System.out.println(res);
	
	CharSequence res1 = str.subSequence(15, 21);
	System.out.println(res1);
}
}
