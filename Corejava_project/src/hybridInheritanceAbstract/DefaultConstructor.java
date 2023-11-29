package hybridInheritanceAbstract;

abstract class GrandParent{
GrandParent(){
	System.out.println("GrandParent: Default constructor");
}
}
abstract class Parent1 extends GrandParent{
Parent1(){
	System.out.println("Parent1: Default constructor");
}
}
class Parent2 extends GrandParent{
Parent2(){
	System.out.println("Parent2: Default constructor");
}
}
class Child1 extends Parent1{
Child1(){
	System.out.println("Child1: Default constructor");
}
}
public class DefaultConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandParent GP=new Child1();
		System.out.println("**********************************");
		Parent1 P1 = new Child1();
		System.out.println("**********************************");
        Child1 ch1 =new Child1();
        System.out.println("**********************************");
        GrandParent GP1 = new Parent2();
        System.out.println("**********************************");
        Parent2 P2 = new Parent2();
	}

}
