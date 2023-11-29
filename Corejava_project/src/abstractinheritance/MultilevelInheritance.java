package abstractinheritance;
abstract class GrandParent{
	GrandParent(){
		System.out.println("GrandParent: Default constructor");
	}
}
abstract class Parent extends GrandParent{
	Parent(){
		System.out.println("Parent: Default constructor");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("Child: Default constructor");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandParent GP=new Child();
		Parent P = new Child();
        Child ch =new Child();
	}

}
