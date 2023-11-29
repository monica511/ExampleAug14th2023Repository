package staticmembers;
class Example{
	static String name;
	static int age;
	public static void method1(){
		System.out.println("Method method1() ");
	}
	static {
		System.out.println("static block 1");
	}
	static {
		System.out.println("static block 2");
	}
}
public class StaticMembersInAnotherClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Example.name= "Abdul Kalam";
    Example.age = 71;
    System.out.println("Name is : "+Example.name+"& age is :"+Example.age);
    Example.method1();
    //try {
    //Class.forName("staticmembers.Example");
    //}catch(ClassNotFoundException e) {
    //	e.printStackTrace();
    //}
	}

}
