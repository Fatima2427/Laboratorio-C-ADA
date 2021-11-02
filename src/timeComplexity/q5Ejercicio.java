
public class q5Ejercicio {
	public static void main (String [] args) {
	q5(100);
	}
	public static void q5 ( int n) {//O(n'2)
	for ( int i= 0; i<n ; i++) {
		for ( int j= 0; j<i; j++) {
			System.out.println("j " + j);
		}
		System.out.println("i--> "  + i);
		}
	}
}