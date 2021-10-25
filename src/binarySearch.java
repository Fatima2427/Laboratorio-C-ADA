
import java.util.*;
public class Ejercicios {
	public static void main(String [] args) {
		//-----------------Ejemplo para invertir lista ordenada----------//
		 int [] lista = new int [10];
			for( int j=0; j<lista.length;j++) {
				lista[j]=(int)(Math.random()*1000+1);//llenamos nuestra lista de tamaÃ±o a con numeros alatorios
			}
		//InvertirLista(lista);
		// ---------------fin del ejemplo -----//
			System.out.println("-----------------tiempos ------------");
			//tiempoListas("busqueda");
			System.out.println("-----------tiempos ------------");
			//tiempoListas("sort");

		
	}
static void tiempoListas(String caso) {//creamos 50 listas con tamaÃ±os incrementados
	long [] tiempos = new long [500] ;// lista donde se almacenaran los tiempos de la operacion
	int [] listaTamaño = new int[500];
	int  tamaño =100;
			for ( int i=0; i<tiempos.length;i++) {
				tiempos[i]=tiempoDemorado(tamaño,caso);
				tamaño=tamaño+100;// tamaÃ±o incrementandose para cada lista
				listaTamaño[i]=tamaño;
				}
			for ( int i=0; i<tiempos.length;i++) {
				System.out.println(tiempos[i]);
			}
				System.out.println("------TamaÃ±os de la lista---------");
				for ( int j=0; j<listaTamaño.length;j++) {
					System.out.println(listaTamaño[j]);
			
			}
	}
static long tiempoDemorado(int a, String caso){ //retorna el tiempo que se demora en realizar nuestras operaciones
	int [] lista = new int [a];
	long TInicio, TFin, tiempo = 0;
	for( int j=0; j<lista.length;j++) {
		lista[j]=(int)(Math.random()*10000+1);//llenamos nuestra lista de tamaÃ±o a con numeros alatorios
	}
	if (caso.equalsIgnoreCase("sort")){    
		TInicio = System.nanoTime();
		insertionSort(lista);//calcula el tiempo de insertionSort con la lista
		TFin= System.nanoTime();
		tiempo = TFin - TInicio;
	}else if (caso.equalsIgnoreCase("busqueda")){      
		TInicio = System.nanoTime();
		busquedaLineal(lista);//calcula el tiempo de busqueda Lineal con la lista
		TFin= System.nanoTime();
		tiempo = TFin - TInicio;
	}
	return tiempo;
}
static void insertionSort(int[]lista) {  

	int i,j,key;
	for( j=2; j<lista.length;j++) {
		key=lista[j];
		i=j-1;
		while(i>0 && lista[i]>key) {
			lista[i+1]=lista[i];
			i=i-1;
		}
		lista[1+i]=key;
	}

}
static void InvertirLista( int [] lista) {
	insertionSort(lista);//ordenamos la lista primero
     for (int i=lista.length-1; i>0;i--) {
    	 System.out.println(lista[i]);
	}

}
static boolean busquedaLineal( int [] lista) {
	final int numero = 20; //numero a buscar
	boolean respt = false;
     for (int i=0 ; i<lista.length;i++) {
		if( lista[i]==numero) {
			return true;
		}
	}
     return respt;
}


}
