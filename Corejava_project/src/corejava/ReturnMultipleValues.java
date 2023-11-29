package corejava;

public class ReturnMultipleValues {
	public static int[] ArithOperation(int a, int b)  
	{  
	int add = a + b;  
	int substract = a - b;  
	int multiply = a * b;  
	int divide = a / b;  
	int ans[] = new int[4];  
	ans[0] = add;  
	ans[1] = substract;  
	ans[2] = multiply;  
	ans[3] = divide;  
	return ans;  
	}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 6;  
		int num2 = 3;  
		int result[] = ArithOperation(num1, num2);  
		System.out.println("The sum of numbers " + num1 + " and " + num2 + " is: " + result[0]);  
		System.out.println("The difference of numbers " + num1 + " and " + num2 + " is: " + result[1]);  
		System.out.println("The multiplication of numbers " + num1 + " and " + num2 + " is: " + result[2]);  
		System.out.println("The division of numbers " + num1 + " and " + num2 + " is: " + result[3]);  
	}

}
