public class q8Ejercicio {
	public static void main (String [] args) {
	q8(100);
	}
	public static void q8 ( int n) {//Olog(n)

	for ( int i= n; i>=1 ;i= i/2) {
			System.out.println("j " + i);
		}
	}
}