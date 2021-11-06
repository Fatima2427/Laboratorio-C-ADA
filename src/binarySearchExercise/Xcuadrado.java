
public class Xcuadrado {
	public static void main( String [] args) {
		System.out.println(cuadratico(16));
		
	}
	//Pregunta 1 ¿Es x un cuadrado? No use la función sqrt. Tienen que usar búsqueda binaria
	public static boolean cuadratico ( int  x) {
		int [] listaX = crearListaX(x);
		
		int total = listaX.length;
		int first = 0;
	    int fin= total-1;
	    while (first <= fin) {
	        int mitad =(fin+first) / 2;
	        if (listaX[mitad]*listaX[mitad]==x ) {
	            return true;
	        } else if (x < listaX[mitad]*listaX[mitad]) {
	            fin= mitad-1;
	        } else  {
	            first= mitad+1;
	        }
	    }
		return false;
	}
	static int[] crearListaX(int num) {
	int [] x  = new int [num];
		for (int i=0 ; i<num; i++){
			x[i]=i;	
			//System.out.println(i);
		}
	return x;
	}
}