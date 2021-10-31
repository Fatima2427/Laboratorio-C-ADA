public class q2Ejercicio {
	public static void main (String [] args) {
	int [] lista = {4,7,8,5,9,4,1,7,0,5,8,4,9};
	q2(lista);
	}
	public static void q2 ( int [] lista) {//O(n)
		int n= lista.length;
	for ( int i= n ; i>0 ; i--) {
			System.out.println(i);
		}
	}
}