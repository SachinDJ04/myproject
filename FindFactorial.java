package practice;

public class FindFactorial {
	
	public static void main(String[] args) {
		
		System.out.println("Factorial : " + new FindFactorial().factorial(7));
		
	}
	
	int factorial(int num) {
		if( num == 0 ) {
			return 1;
		}
		System.out.println("num : " + num);
		System.out.println("num-1 : " + (num-1));
		int result = num * factorial(num-1);
		System.out.println("Result : " + result);
		return result;	
	}

}
