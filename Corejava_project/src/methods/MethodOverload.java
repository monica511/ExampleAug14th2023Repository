package methods;
class Overloading{
	public void display(String name) {
		System.out.println("Name is "+name);	
	}
    public void display(int age) {
    	System.out.println("Age is "+age);	
	}
    
    public void display() {
		System.out.println("");	
	} 
    public void display(String name, int age) {
		System.out.println("Name is "+name+" & age is "+age);	
	}
    public void display(int age, String name ) {
    	System.out.println("Age is "+age+" & name is "+name);	
	}
}

public class MethodOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
