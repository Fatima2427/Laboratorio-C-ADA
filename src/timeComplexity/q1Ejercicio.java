
public class q1Ejercicio {
	public static void main (String [] args) {
	int [] lista = {4,7,8,5,9,4,1,7,0,5,8,4,9};
	q1(lista);
	}
	public static void q1 ( int [] lista) {//O(n)
		int n= lista.length;
	for ( int i= 0 ; i< n ; i++) {
			System.out.println(i);
		}
	}
}