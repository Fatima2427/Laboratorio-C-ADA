
public class mayorIgual {
	public static void main( String [] args) {
		int [] m = {0,1,6,7,8,10,14,20,50};
		System.out.println(firstMayor(m, 45));
		
	}
	//Pregunta 1 ¿Es x un cuadrado? No use la función sqrt. Tienen que usar búsqueda binaria
	public static int firstMayor( int[] lista,int element) {	
		int total = lista.length;//total d elementos en la lista 
	    int first = 0;
	    int fin= total-1;
	    int mayor=-1;
	    while (first <= fin) {
	        int mitad = first +(fin- first) / 2;
	       if (element <=lista[mitad] ) {
	            mayor = lista[mitad];
	            break;
	        } else if (element < lista[mitad]) {
	            fin= mitad-1;
	    
	        } else  {
	            first= mitad+1;
	        }
	    }
	    return mayor;
	}
}