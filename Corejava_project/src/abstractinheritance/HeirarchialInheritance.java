package abstractinheritance;
abstract class Parent1{
	Parent1(){
		System.out.println("Parent1: Default constructor");
	}
}
class Child1 extends Parent1{
	Child1(){
		System.out.println("Child1: Default constructor");
	}
}
class Child2 extends Parent1{
	Child2(){
		System.out.println("Child2: Default constructor");
	}
}
public class HeirarchialInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Parent1 P1 =new Child1();
        System.out.println("**********************************");
        Child1 ch1=new Child1();
        System.out.println("**********************************");
        Child2 ch2=new Child2(); 
	}

}
