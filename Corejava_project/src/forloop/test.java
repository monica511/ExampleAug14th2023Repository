package forloop;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[2][3];
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;
		System.out.println("FOR LOOP ******************************");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("FOR EACH LOOP **********************");
		for(int x1[]:arr) {
			for(int x2: x1) {
				System.out.print(x2+" ");
			}
			System.out.println();
		}
		System.out.println("WHILE LOOP *********************");
		int i=0;
		while(i<arr.length) {
		int j=0;
		   while(j<arr[i].length) {
			   System.out.print(arr[i][j]+" ");
			   j++;
		   }
		   System.out.println();
		   i++;
		}
	}

}
