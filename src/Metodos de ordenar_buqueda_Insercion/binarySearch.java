
import java.util.*;

public class binarySearch {
public static void main( String [] args) {
	int [][] matriz = {{1,2,3},{4,5,6 },{7,8,3}};
	int [] m = {1,2,3,4,5,6 };
	 //for ( int i=0; i <matriz.length;i++) {
	//	for ( int j=0; j<matriz[i].length;j++) {
	//		System.out.print(matriz[i][j] +" ");}
	//	System.out.println();}


	System.out.println(binary_search(m, 5));
}

public static int binary(int[][] lista, int element) {
	int total = lista.length*lista[0].length;//total d elementos en la matriz
    int first = 0;
    int fin= total-1;
    int elementPos = -1;
    while (first <= fin) {
        int mitad = (first+ fin) / 2;
        if (element >=lista[mitad][0] && element >=lista[mitad][lista[mitad].length] ) {
            elementPos = mitad;
            break;
        } else if (element < lista[mitad][lista.length-1]) {
            fin= mitad-1;
        } else if (element > lista[mitad][lista.length-1]) {
            first= mitad+1;
        }
    }
    return elementPos;
}
public static int binary_search(int[] lista, int element) {
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
}}