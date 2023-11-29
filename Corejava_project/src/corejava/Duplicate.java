package corejava;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,10,8,12,18,5,23};
	      
	      for(int i = 0; i<arr.length; i++ ){
	         for(int j = i+1; j<arr.length; j++){
               if(arr[i]==arr[j]) {
            	 System.out.println("Duplicate values are : "+arr[i]+" and "+arr[j]);  
               }
	           
	         }
	      }

	}

}
