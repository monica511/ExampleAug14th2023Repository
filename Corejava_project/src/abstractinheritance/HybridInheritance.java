package abstractinheritance;
abstract class GrandParent1{
GrandParent1(){
	System.out.println("GrandParent1: Default constructor");
}
}
abstract class Parent2 extends GrandParent1{
Parent2(){
	System.out.println("Parent2: Default constructor");
}
}
class Parent3 extends GrandParent1{
Parent3(){
	System.out.println("Parent3: Default constructor");
}
}
class Child3 extends Parent2{
Child3(){
	System.out.println("Child3: Default constructor");
}
}
public class HybridInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandParent1 GP1=new Child3();
		System.out.println("**********************************");
		Parent2 P2 = new Child3();
		System.out.println("**********************************");
        Child3 ch3 =new Child3();
        System.out.println("**********************************");
        GrandParent1 GP = new Parent3();
        System.out.println("**********************************");
        Parent3 P3 = new Parent3();
	}

}
