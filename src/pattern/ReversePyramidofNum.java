package pattern;

public class ReversePyramidofNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		for(int i=n;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
