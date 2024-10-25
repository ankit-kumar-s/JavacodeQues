package dSA;

public class BinarySearch {

	public static void main(String[] args) {
	

		int[] arr = { 2, 4, 5, 8, 11 };

		// binrySearch(arr,11);
		int[] desc = { 31, 21, 20, 15, 11, 10 };
		// binrySearchdesc(desc,31);
		// binarySearchOderAgnostic(arr,11);
		// binarySearchOderAgnostic(desc,10);
		int[] aray = { 2, 2, 4, 4, 6, 8, 9 };
		// searchfirstocc(aray,4,true);
		int arr1[] = { 4, 4, 6, 6, 6, 15, 16, 23, 23, 42 };
		//now user want to print only fist and last occurence
		int res[] = new int[2];
		int first = totalnoOfocc(arr1,23,true);//return first occurrence
		int last = totalnoOfocc(arr1, 23 ,false); //eturn last occrrence
		res[0]=first;
		res[1]=last;
		
		//System.out.println(res[0] + " " +res[1]);
		
		// now to find total we have a formula
		/*
		 * if (first == -1) { System.out.println("Occurrence of target is :" + 0);// if
		 * there is no occurene; } else { System.out.println("ocurrence of target is :"
		 * + (last - first + 1)); }
		 */
		
		int []floor = {2,3,4,4,5,7,9,23,25};
		float [] f = {6.2f,6.3f,6.7f,7.0f};
	//	int floordata =bsfloor(floor,1);
	//loat floordata = bsceiling(f, 6.4f);
	/*
	 * //f(floordata==-1) { System.out.println("Target not found in array"); } else
	 * { System.out.println(floordata); }
	 */
		
		char[] ch = {'x','f','g','i'};
		char find = binayrCharCeil(ch,'c');
	//	System.out.println(find);
		
		int [] arrdesc= {100,99,98,86,80,70,1};
		int resdesc=binarySeachfloordesc(arrdesc,85);
		System.out.println(resdesc);
		
		}



	
	public static int binarySeachfloordesc(int [] arr,int target) {
		
		int start= 0;
		int end = arr.length - 1;
        int ans=0;
        while (start <= end) {
        	int mid=start+(end-start)/2;
        	if(arr[mid]==target) {
        		ans=arr[mid];
        		break;
        	}else if(target > arr[mid]) {
        		end =mid-1;
        		ans=arr[mid];
        	}
        	else {
        		start = mid +1;
        	}
        }
        return ans;
		
	}
	
	
	 
	
	
	//find smallest character that is greater than taret 
 		public static char binayrCharCeil(char[] arr, char target) {
		int start =0 ;
		int end = arr.length - 1;
		char ans = '$';
		while(start<=end) {
			int mid =start +(end-start)/2;
			if(arr[mid]<=target) {
				start = mid+ 1;
			}else {
				end=mid -1;
				ans=arr[mid];
			}
		}
		return (ans=='$')?arr[0]:ans;
		
	}
		
		
	public  static  float bsceiling(float []arr,float target) {
		int start =0;
		int end = arr.length - 1;
		float ans = -1;
		while(start<=end) {
			int mid= start +(end-start)/2;
			if(arr[mid]==target) {
				ans= arr[mid];
				break;
			}else if(arr[mid]<target) {
				start=mid+1;
				
			}else {
				end=mid-1;
				ans= arr[mid];
			}
		}
		return ans;
		
	}
	
	//floor and ceiling
	//floorr = gretest than or equal to or smaller than target
	//celing = smallest than or eqaul to or grater than tartget
	public  static  int bsfloor(int []arr,int target) {
		int start =0;
		int end = arr.length - 1;
		int ans = -1;
		while(start<=end) {
			int mid= start +(end-start)/2;
			if(arr[mid]==target) {
				ans=arr[mid];
				break;
			}else if(arr[mid]<target) {
				start=mid+1;
				ans=arr[mid];
			}else {
				end=mid-1;
			}
		}
		return ans;
		
	}

	// from given array which contain duplicates,  found total no.of occurrence
	public static int totalnoOfocc(int arr[], int target, boolean found) {
		int start = 0;
		int end = arr.length - 1;
		int ans = -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				ans = mid;
				if (found) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return ans; // this will retrurn the indexes

	}

	public static void searchfirstocc(int arr[], int target, boolean found) {

		int start = 0;
		int end = arr.length - 1;
		int ans = -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				ans = mid;
				if (found) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		if (ans == -1) {
			System.out.println("Target not found");
		} else {
			System.out.println("Target found at : " + ans);
		}

	}

	public static void binarySearchOderAgnostic(int arr[], int target) {

		int start = 0;
		int end = arr.length - 1;
		if (arr[start] <= end) {
			binrySearch(arr, target);
		} else {
			binrySearchdesc(arr, target);

		}

	}

	public static void binrySearch(int arr[], int target) {
		int start = 0;
		int end = arr.length - 1;
		int ans = -1; // 0<4
		while (start <= end) { // this while condition check tht if array have only one single element

			int mid = start + (end - start) / 2; // 2 //4
			if (arr[mid] == target) {
				ans = mid;
				break;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1; // 3
			}

		}
		if (ans == -1) {
			System.out.println("Target not found in array");
		} else {
			System.out.println("Target  found : " + target + "at index " + ans);
		}
	}

	public static void binrySearchdesc(int arr[], int target) {
		int start = 0;
		int end = arr.length - 1;
		int ans = -1;
		while (start <= end) { // this while condition check tht if array have only one single element

			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				ans = mid;
				break;
			} else if (arr[mid] < target) {

				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}
		if (ans == -1) {
			System.out.println("Target not found in array");
		} else {
			System.out.println("Target  found : " + target + "at index " + ans);
		}
	}

}
