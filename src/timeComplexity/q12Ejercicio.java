
public class q12Ejercicio {
	public static void main (String [] args) {
	q12(100);
	}
	public static void q12 ( int n) {//O(nlog2n)
	for ( int i= 0; i<n ; i++) {
		for ( int j= 1; j<n; j=j*2) {
			System.out.println("j " + j);
		}
		System.out.println("i--> "  + i);
		}
	}
}