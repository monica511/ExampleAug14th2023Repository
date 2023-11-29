package abstractInheritanceStaticBlock;

abstract class GrandParent{
	static{
		System.out.println("GrandParent: Static Block");
	}
}
abstract class Parent extends GrandParent{
	static{
		System.out.println("Parent: Static Block");
	}
}
class Child extends Parent{
	static{
		System.out.println("Child: Static Block");
	}
}
public class MultilevelInheritanceStaticBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandParent GP=new Child();
		Parent P = new Child();
        Child ch =new Child();
	}

}
