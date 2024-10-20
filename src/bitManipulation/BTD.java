package bitManipulation;

public class BTD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		binaryToDecimal(1011);

	}
	
	static void binaryToDecimal(int binarynumber) {
		
		int result =0;
		
		int power=0;
		while(binarynumber>0) {
			
			int rem=binarynumber%10;
			binarynumber/=10;
			
			result +=  rem *Math.pow(2, power);
			power++;
		}
		System.out.println(result);
		
	}		
		
	}


