package practice;

public class BinaryRecursionFind {
	
	public static void main(String[] args) {
		
		int[] arr = {11,23,24,33,34,43,45,53,65,75,87,99};
		int low=0;
		int high=arr.length-1;
		System.out.println("Low " + low + " high : " + high);

		System.out.println("Hel : " + new BinaryRecursionFind().binarySearch(arr,low,high,67));
		
	}
	
	int binarySearch(int[] arr,int low,int high,int find) {
		System.out.println("Low " + low + "high : " + high);

	if(low>high) {
		return -1;
	}
	
	int mid = (low+high)/2;
	if(find==arr[mid]) {
		return mid;
	}
	else
		if(find > arr[mid]) {
		return binarySearch(arr,mid+1,high,find);
	}
	
	else {
		return binarySearch(arr,low,mid-1,find);
	}
	
	}
}
