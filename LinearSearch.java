package practice;
public class LinearSearch {
	
	public static void main(String[] args) {
		
		int[] arrs = {23,21,11,22,767,53,29,76,54};
		
		boolean b = new LinearSearch().findnum(arrs,767);
		if(b) {
			System.out.println("Num available!!!");
		}
		else {
			System.out.println("Not Found!!!");
		}
	}
	
	boolean findnum(int[] arr,int num) {
		for(int i=0; i<=arr.length-1; i++) {			if(num==arr[i]) {				return true;			}		}
		return false;
	}

}
