
public class q4Ejercicio {
	public static void main (String [] args) {
	int [] lista = {4,7,8,5,9,4,1,7,0,5,8,4,9};
	q4(lista);
	}
	public static void q4 ( int [] lista) {//O(n'2)
		int n= lista.length;
	for ( int i= 0; i<n ; i++) {
		for ( int j= 0; j<n ; j++) {
			System.out.println("j " + j);
		}
		System.out.println("i--> "  + i);
		}
	}
}