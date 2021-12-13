
public class MaxValor {
	public static void main (String [] args) {
		int [] a = {1, 3, 7, 9 , 9};
		int [] b = {5, 6 , 8 , 9 , 10};
		System.out.println(max(a,b));
 	}
	static int max(int [] a ,  int [] b ) {
		int maxCoincidencias =0;
		if ( a != null || b!=null) {
		for ( int i=0 ; i< a.length-1;i++) {
			if (  b[i]<=a[i+1] ) {
				maxCoincidencias ++;
			}
			
		}
		}
		return maxCoincidencias;
	}
}
