package bitManipulation;

public class DTB {

	public static void main(String[] args) {
		
           decimalToBinary(11);
	}
	
	
	public static void decimalToBinary(int decimalnumber) {
		
		int result =0;
		
		int power=0;
		while(decimalnumber>0) {
			
			int rem=decimalnumber%2;
			decimalnumber/=2;
			
			result +=  rem *Math.pow(10, power);
			power++;
		}
		System.out.println(result);
		
	}

}
