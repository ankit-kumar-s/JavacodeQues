package dSA;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {2,4,5,8,11};
		
		//binrySearch(arr,11);
		int []desc = {31,21,20,15,11,10};
		binrySearchdesc(desc,31);
		//binarySearchOderAgnostic(arr,11);
		//binarySearchOderAgnostic(desc,10);

	}
	
	public static void  binarySearchOderAgnostic(int arr[] ,int target){
		
		int start =0;
		int end =arr.length-1;
		if(arr[start] <= end) {
			binrySearch(arr,target);
		}
		else {
			binrySearchdesc(arr ,target);
			
		}
		
	}
	
	public static void binrySearch(int arr[] , int target) {
		int start = 0;
		int end = arr.length-1;
		int ans=-1; //0<4
		while(start<=end) { // this while condition check tht if array have only one single element
			
			int mid = start +(end-start)/2; //2 //4
			if(arr[mid]==target) {
				ans= mid;
				break;
			}
			else if(arr[mid]<target) {
				start = mid+1;
			}
			else {
				end=mid-1; //3
			}
			
		}
		if(ans==-1) {
			System.out.println("Target not found in array");
		}else {
			System.out.println("Target  found : " + target + "at index " + ans);
		}
	}
	
	public static void binrySearchdesc(int arr[] , int target) {
		int start = 0;
		int end = arr.length-1;
		int ans=-1;
		while(start<=end) { // this while condition check tht if array have only one single element
			
			int mid = start +(end-start)/2;
			if(arr[mid]==target) {
				ans= mid;
				break;
			}
			else if(arr[mid]<target) {
				
				end=mid-1;
			}
			else {
				start = mid+1;
			}
			
		}
		if(ans==-1) {
			System.out.println("Target not found in array");
		}else {
			System.out.println("Target  found : " + target + "at index " + ans);
		}
	}

}
