package corejava;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
	      int arr[] = {5,10,8,12,18,1,23};
	      
	      for(int i = 0; i<arr.length; i++ ){
	         for(int j = i+1; j<arr.length; j++){

	            if(arr[i]>arr[j]){
	               temp = arr[i];
	               arr[i] = arr[j];
	               arr[j] = temp;
	            }
	         }
	      }
	      System.out.println("second largest number is: "+arr[arr.length-2]);
	}

}
