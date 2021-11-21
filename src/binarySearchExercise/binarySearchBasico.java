public static int binarySearchBasico(int[] lista, int element) {
	int total = lista.length;//total d elementos en la lista 
    int first = 0;
    int fin= total-1;
    int elementPos = -1;
    while (first <= fin) {
        int mitad = (first+ fin) / 2;
        if (element ==lista[mitad] ) {
            elementPos = mitad;
            break;
        } else if (element < lista[mitad]) {
            fin= mitad-1;
        } else  {
            first= mitad+1;
        }
    }
    return elementPos;
}