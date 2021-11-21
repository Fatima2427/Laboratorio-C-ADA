
public class q10Ejercicio {
	public static void main (String [] args) {
	q9(100);
	}
	public static void q9 ( int n) {//O(n+m) =O(n)

	for ( int i= 0; i<n ;i++) {
			System.out.println("i " + i);
		}
	for ( int j= 0; j<=n ;j++) {
		System.out.println("j " + j);
	}
	}
}