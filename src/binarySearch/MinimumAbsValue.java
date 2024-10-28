package binarySearch;

public class MinimumAbsValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,2,4,5,7,9,25,56,88,94};
		
		int result = findMAD(arr,6);
		System.out.println(result);

	}
	
	public static int findMAD(int[] arr,int target) {
		int start =0;
		int end= arr.length - 1;
		int ans=-1;
		while(start<=end) {
			int mid  = start + (end-start)/2;
			if(arr[mid]==target) {
				ans=mid;
				break;
			}else if(arr[mid]<target) {
				start = mid+1;
			}
			else {
				end = mid -1;
			}
		}
		int res=0;
		if(ans==-1) {
			//now here we will check edge case scenarion for floor and ceiling
			if(end==-1) {
				//if our floor is not present 
				res= Math.abs(target - arr[start]);
				}
			else if(start == arr.length) {
				//if our ceiling is not present 
				res= Math.abs(target-arr[end]);
			}
			else {
				//if our floor and ceiling is present 
				int ans1 = Math.abs(target - arr[start]); //for ex : 8 12 13 , 12 is trget in this case 8 is available and its our floor 
				int ans2 =Math.abs(target-arr[end]);//13 is our ceiling
				res = (ans1<ans2)?ans1:ans2;
				
			}
			
		}
		return res;
		
	
	}

}
