package ifstatements;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int marks=70;
     if(marks>=80&&marks<=100) {
    	System.out.println("Distinction"); 
     }
     else if(marks>=60&&marks<=79) {
    	 System.out.println("First Class");  
     }
     else if(marks>=40&&marks<=59) {
    	 System.out.println("Second Class");  
     }
     else if(marks>=30&&marks<=39) {
    	 System.out.println("Pass Class");  
     }
     else if(marks>=0&&marks<30) {
    	 System.out.println("Fail");  
     }
}
     

}
