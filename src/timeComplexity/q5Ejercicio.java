
public class q5Ejercicio {
	public static void main (String [] args) {
	int [] lista = {4,7,8,5,9,4,1,7,0,5,8,4,9};
	q5(lista);
	}
	public static void q5 ( int [] lista) {//O(n'2)
		int n= lista.length;
	for ( int i= 0; i<n ; i++) {
		for ( int j= 0; j<i; j++) {
			System.out.println("j " + j);
		}
		System.out.println("i--> "  + i);
		}
	}
}