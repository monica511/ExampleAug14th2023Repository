package abstractInheritanceStaticBlock;

abstract class Parent4{
	static{
		System.out.println("Parent4: Static Block");
	}
}
class Child4 extends Parent4{
	static{
		System.out.println("Child4: Static Block");
	}
}
class Child5 extends Parent4{
	static{
		System.out.println("Child5: Static Block");
	}
}
public class HeirarchialInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Parent4 P4 =new Child4();
	        System.out.println("**********************************");
	        Child4 ch4=new Child4();
	        System.out.println("**********************************");
	        Child5 ch5 =new Child5();
	}

}
