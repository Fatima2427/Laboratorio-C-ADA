
public class q11Ejercicio {
	public static void main (String [] args) {
	q11(100);
	}
	public static void q11 ( int n) {//O(n'2+m'2)

	for ( int i= 1; i<n ;i=i*2) {
			System.out.println("j " + i);
		}
	for ( int j= 1; j<=n ;j=j*2) {
		System.out.println("j " + j);
	}
	}
}