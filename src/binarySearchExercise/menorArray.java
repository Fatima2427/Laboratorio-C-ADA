public class menorArray {
	public static void main( String [] args) {
		int [] m = {5,6,7,8,4};
		System.out.println(menorArrayRotatdo(m));
		
	}
	//Pregunta 3. Encuentre el menor elemento en un array ordenado rotado (desplazado)
	public static int menorArrayRotatdo( int[] lista) {	
		int total = lista.length;//total d elementos en la lista 
	    int first = 0;
	    int fin= total-1;
	    int menor=lista[total-1];
	    while (first <= fin) {
	        int mitad =(fin+ first) / 2;
	       if (lista[mitad] > lista[fin]  ) {//si mitad es mayor que el ultimo entonces el dato menor debe estar hacia R -fin, esto solo sirve para saber si nuestra lista ordenada fue rotada o no
	            first= mitad+1;//movemos hacia fin
	        } else  {
	            fin= mitad-1;//movemos hacia el primer termino
	            menor= lista[mitad];
	        }
	    }
	    return menor;
	}
}