public class q9Ejercicio {
	public static void main (String [] args) {
	q9(100);
	}
	public static void q9 ( int n) {//O(raiz n)

	for ( int i= 0; i*i<=n ;i++) {
			System.out.println("j " + i);
		}
	}
}