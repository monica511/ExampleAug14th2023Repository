package ifstatements;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String item="Rose";
    String category="Flower";
    if(category.equals("Flower")) {
    	System.out.println("The Category is :"+category);  
    }
    if(item.equals("Rose")) {
    	System.out.println("The Category is :"+category);  
    }
    else if(item.equals("Tuberose")) {
    	System.out.println("King of flower");  
    }
    else {
    	System.out.println("Invalid items in flower category");  
    }
    
    
	}

}
