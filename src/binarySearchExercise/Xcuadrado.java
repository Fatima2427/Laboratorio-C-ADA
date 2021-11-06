
public class Xcuadrado {
	public static void main( String [] args) {
		System.out.println(cuadraticoX(27));
		
	}
	//Pregunta 1 ¿Es x un cuadrado? No use la función sqrt. Tienen que usar búsqueda binaria
	public static boolean cuadraticoX( int  x) {	
		int total =x;
		int first = 0;
	    int fin= total-1;
	    while (first <= fin) {
	        int mitad =(fin+first) / 2;
	        if (mitad*mitad==x ) {
	            return true;
	        } else if (x < mitad*mitad) {
	            fin= mitad-1;
	        } else  {
	            first= mitad+1;
	        }
	    }
		return false;
	}
}