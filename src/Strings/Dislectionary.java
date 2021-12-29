
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class Dyslectionary {
    //2. Dyslectionary

    //The Dyslectionary is just like an ordinary dictionary except that it organizes words based on how
//they end rather than how they start.

//----- Si funciona pero me da error los test por eso estoy dejando con caso de prueba igual con los demas ejercicios.... ------
	public static void main (String [] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<ArrayList<String>> listaGeneral = new ArrayList<ArrayList<String>> ();
	
		ArrayList<String>   lista =new  ArrayList<String>();
	
		lista.add("airplanes");
		lista.add("bicycle");
		lista.add("boatj");
		lista.add("car");

		ArrayList<String>   lista2 =new  ArrayList<String>();
	
		lista2.add("airplanes");
		lista2.add("bicyl");
		lista2.add("boat");
		lista2.add("car");
			listaGeneral.add(ordenar(lista));
			listaGeneral.add(ordenar(lista2));

	for ( ArrayList<String> a : listaGeneral)
		mostrar(a);
}
static ArrayList<String > ordenar(ArrayList<String > arreglo ) {
	int max= 0;
	
	for ( String a : arreglo) {
		if ( a.length() >max) {
			max=a.length();
		}
	}
    for (int i=0; i < arreglo.size()-1; i++ ) {
    	for (int j=i+1; j<arreglo.size(); j++) {
    		if (arreglo.get(i).charAt(arreglo.get(i).length()-1) >arreglo.get(j).charAt(arreglo.get(j).length()-1)) {  	
    			String temp = arreglo.get(i);
    			arreglo.set(i, arreglo.get(j));
    			arreglo.set(j, temp);
    		}
    		} 
    }
    return Spacios(arreglo);
}
static ArrayList<String>Spacios(ArrayList<String> lista){ //despues de invertir se debe agrgar espacios
	int tam = 0;
	for(String word : lista)
		if(word.length() > tam)
			tam = word.length();//encontrar la palabra mas larga...

	for(int i = 0; i < lista.size(); i++){//agrega espacios segun la palabra mas larga
		String space = "";
		for(int j = 0; j < tam - lista.get(i).length(); j++) space += " ";
		lista.set(i, space + lista.get(i));
	}

	return lista;
}
static void mostrar (ArrayList<String > arreglo) {
	for (int i=0; i < arreglo.size(); i++ ) {
		System.out.println ( arreglo.get(i));
	}
	System.out.println ();
}
}