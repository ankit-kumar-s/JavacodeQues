
package dSA;

public class insertarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = {10,20,5,3};
		//insert(array,0,22);
		delete(array,2);
		  for (int i : array) {
	            System.out.print(i+ " ");
	        }
		
		
        
	}
	
	
	public static void insert(int arr[], int position , int element) {
		int size= arr.length;
		
		if(position < 0 && position > size-1) {
			System.out.println("No AIOOBE");
		}
		
		for(int i= size-2; i>=position;i--) {
			 arr[i+1]= arr[i];
			 
			 
		}
		arr[position]= element;
		
		
}
	
	public static void delete(int arr[],int position) {
		
		for(int i=position ;i<=arr.length-2;i++) {
			
			System.out.println("inside loop");
			arr[i]=arr[i+1];
		
			
		}
		arr[arr.length-1]=0;
	}
	
}
