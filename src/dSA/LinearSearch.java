package dSA;

public class LinearSearch {

	public static void main(String[] args) {

		int arr[] = { 2, 2, 3, 4, 1, 7, 2, 9, 3 };

		// linearSearch(arr,11);
		// linearSearchlastoccurance(arr,2,false); // if user dont want to find last
		// occuraane , pass false
		// linearSearchlastoccurance(arr,2,true); // if user want to find last occurance
		// , pass true
		linearSearchMultiple(arr,3);

		// findMax(arr);

		// findMin(arr);

		int arr2d[][] = { { 2, 4, 1, 5, 1 }, { 6, 7, 3, 4, 2 }, { 8, 1, 2, 2, 3 }, { 5, 5, 5, 8, 4 } };

		//linearsearch2DOccurance(arr2d, 1, false);
		//linearsearch2DOccurance(arr2d, 1, true);
		//linearSearchMultipleOcurance(arr2d,2);
		
		//findMaximumSumSubArray(arr2d);
		//findMinimunSumSubArray(arr2d);
	}

	public static void linearSearch(int arr[], int target) {

		int ans = -1; // if element is not present in array at that time it will print -1

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				ans = i;
				break;
			}
		}
		if (ans == -1) {
			System.out.println("Target not found in array");
		} else
			System.out.println("Target found in array at position :" + ans);
	}

	public static void linearSearchlastoccurance(int arr[], int target, boolean findlastOccurance) {

		int ans = -1; // if element is not present in array at that time it will print -1

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				ans = i;
				if (findlastOccurance == false) {
					break;
				}
			}
		}
		if (ans == -1) {
			System.out.println("Target not found in array");
		} else
			System.out.println("Target found in array at position :" + ans);
	}

	public static void linearSearchMultiple(int arr[], int target) {

		int ans[] = new int[arr.length];
		int k = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				ans[k] = i;
				k++;
			}
		}
		if (k == 0) {
			System.out.println("Target not found in array");
		} else {
			for (int i = 0; i < k; i++) {
				System.out.println("Target found in array at position :" + ans[i]);
			}
		}

	}

	public static void findMax(int arr[]) {

		int max = arr[0];
		int max1 = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) { // second way is if(max1<arr[i])
				max = arr[i];
			}
		}
		System.out.println("Maximum element in array is :" + max);
	}

	public static void findMin(int arr[]) {

		int min = arr[0];
		int max1 = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {

				min = arr[i];
			}
		}
		System.out.println("Minimum element in array is :" + min);
	}

	public static void linearsearch2DOccurance(int arr[][], int target, boolean findlast) {

		int outerIndex = -1;
		int innerIndex = -1;

		for (int i = 0; i < arr.length; i++) {
			boolean found = false; // using this to break from outerLoop
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == target) {
					outerIndex = i;
					innerIndex = j;
					if (findlast == false) {
						found = true; // once element is found now need to break from outerloop also , so reasign true
										// value to boolean found variable
						break;
					}
				}
			}
			if (found == true) {
				break;
			}
		}

		if (outerIndex == -1) {
			System.out.println("Target not found in our 2D array");
		} else {
			System.out.println("Target found at position  of outerIndex:" + outerIndex + ",  " + innerIndex);
		}

	}

	 public static void linearSearchMultipleOcurance(int arr[][], int target) {
		 
      int size =0 ;
      for(int i = 0 ; i<arr.length ; i++) {
    	  size += arr[i].length;
      }
      
      int ans[][] = new int[size][2];
      int k = 0 ; 
      
      for(int outerindex=0 ; outerindex<arr.length ; outerindex++) {
    	 
    	  for(int innerIndex = 0 ; innerIndex < arr[outerindex].length ; innerIndex++) {
    		  if(target == arr[outerindex][innerIndex]) {
    			  ans[k][0] = outerindex;
    			  ans[k][1]= innerIndex;
    			  k++;
    			 
    		  }
    	  }
			 
      }
      
      if(k==0) {
    	  System.out.println("Target not found in array");
		} else {
			for (int i = 0; i < k; i++) {
				System.out.println("Target found in array at position :" + ans[i][0] + "," + ans[i][1]);
			}
    	  
    	  
      }
		 
	 }
	 
	 public static void findMaximumSumSubArray(int arr[][]) {
		 
		 int max= Integer.MIN_VALUE ; // need to compare the min valu with max value
		 int resultindex = -1 ;
		 
		 for(int i=0; i<arr.length ; i++) {
			 int sum = 0;
			 for(int j=0;j<arr[i].length ; j++) {
				 sum += arr[i][j];
			 }
			 
			 if(sum>max) {
				 max=sum;
				 resultindex = i;
			 }
		 }
		 
		 System.out.println(" MaxiMum sum of SubArray is : " + max + ", " + "found at index " + resultindex);
		 
	 }

	 
	 public static void findMinimunSumSubArray(int arr[][]) {
		 
		 int min= Integer.MAX_VALUE ; // need to compare the min valu with max value
		 int resultindex = -1 ;
		 
		 for(int i=0; i<arr.length ; i++) {
			 int sum = 0;
			 for(int j=0;j<arr[i].length ; j++) {
				 sum += arr[i][j];
			 }
			 
			 if(sum<min) {
				 min=sum;
				 resultindex = i;
			 }
		 }
		 
		 System.out.println(" MaxiMum sum of SubArray is : " + min + ", " + "found at index " + resultindex);
		 
	 }
		 

}
