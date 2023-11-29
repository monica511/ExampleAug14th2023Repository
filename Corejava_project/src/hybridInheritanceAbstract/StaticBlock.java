package hybridInheritanceAbstract;

abstract class GrandParent1{
static{
	System.out.println("GrandParent1: Static Block");
}
}
abstract class Parent3 extends GrandParent1{
static{
	System.out.println("Parent3: Static Block");
}
}
class Parent4 extends GrandParent1{
static{
	System.out.println("Parent4: Static Block");
}
}
class Child2 extends Parent3{
static{
	System.out.println("Child2: Static Block");
}
}
public class StaticBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandParent1 GP1=new Child2();
		System.out.println("**********************************");
		Parent3 P3 = new Child2();
		System.out.println("**********************************");
        Child2 ch2 =new Child2();
        System.out.println("**********************************");
        GrandParent1 GP2 = new Parent4();
        System.out.println("**********************************");
        Parent4 P4 = new Parent4();
	}

}
