package practice;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int[] arr = {11,23,24,33,34,43,45,53,65,75,87,99};
		int low=0;
		int high=arr.length-1;
		
		System.out.println(new BinarySearch().binarySearch(arr,low,high,999));
		
		
	}
	
	int binarySearch(int[] arr,int low,int high,int find) {
		if(find>=arr[low] && find<=arr[high]) {
		while(low<high) {
			int mid = (low+high)/2;
			
			if(find==arr[mid]) {
				return mid;
			}
			else if(find>=arr[mid]) {
				low=mid+1;
			}
			else {
				high=mid;
			}
		}
		
		return low;
	}
		return -1;
	}

}
