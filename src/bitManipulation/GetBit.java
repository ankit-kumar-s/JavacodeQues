package bitManipulation;

public class GetBit {

	public static void main(String[] args) {
		// Get the 3rd bit(position=2) of a number n. (n=0101) in decimal it 5
		
		
		int postition=3;
		int number=5;
		int bitmask = 1<<postition;
		if((bitmask & number)==0) {
			System.out.println("bit was zero");
		}
		else
			System.out.println("bit was one");

	}

}
