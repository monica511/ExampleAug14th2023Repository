package abstractInheritanceStaticBlock;

abstract class GrandParent3{
static{
	System.out.println("GrandParent3: Static Block");
}
}
abstract class Parent5 extends GrandParent3{
static{
	System.out.println("Parent5: Static Block");
}
}
class Parent6 extends GrandParent3{
static{
	System.out.println("Parent6: Static Block");
}
}
class Child6 extends Parent5{
static{
	System.out.println("Child6: Static Block");
}
}
public class HybridInheritanceStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandParent3 GP3=new Child6();
		System.out.println("**********************************");
		Parent5 P5 = new Child6();
		System.out.println("**********************************");
        Child6 ch6 =new Child6();
        System.out.println("**********************************");
        GrandParent3 GP4 = new Parent6();
        System.out.println("**********************************");
        Parent6 P6 = new Parent6();

	}

}
