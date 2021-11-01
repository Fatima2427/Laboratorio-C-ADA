
public class q6Ejercicio {
	public static void main (String [] args) {
	int [] lista = {4,7,8,5,9,4,1,7,0,5,8,4,9};
	q6(lista);
	}
	public static void q6 ( int [] lista) {//O(n)
		int n= lista.length;
		int p=0;
	for ( int i= 1; p<=n ; i++) {
		p=p+i;
			System.out.println( i);
		}
	}
}