
import java.util.*;
public class busquedaSecuencial {
	public static void main(String [] args) throws InterruptedException {
		int [] list1 ={ 2,10,5};
		int [] list2 ={ 10,8,100,20,5,30};
		int [] list3 ={ 1,40,4,25,26,7,10,27,59,4,5,71,20,};
		int [] list4 ={ 4,5,78,20,1,4,25,26,40,12,15,50,27,41,10,9,17,25,50,100,84,21,3,53,2};
		int [] list5 ={ 1,40,4,15,13,14,2,58,42,31,52,54,19,28,27,25,21,11,26,40,12,15,50,27,41,10,9,17,25,50,100,84,21,3,53,2};
	search(list1,10);
	ordenar(list1);
	sort(list1);
	search(list2,10);
	ordenar(list2);
	sort(list2);
	search(list3,10);
	ordenar(list3);
	sort(list3);
	search(list4,10);
	ordenar(list4);
	sort(list4);
	search(list5,10);
	ordenar(list5);
	sort(list5);
	}
static void sort(int[]lista) throws InterruptedException {  
	long TInicio, TFin, tiempo;      
	TInicio = System.nanoTime();
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
	TFin= System.nanoTime();
	  tiempo = TFin - TInicio;
	  System.out.println("Tiempo en milisegundos por sort: " + tiempo);
    System.out.println(Arrays.toString(lista));
}
static void ordenar(int [] lista) throws InterruptedException {  
	long TInicio, TFin, tiempo;           
	TInicio = System.nanoTime();
    for(int i=0;i<lista.length-1;i++) {
    	int min=i;
    	for(int j=i+1;j<lista.length;j++) {
    	if(lista[j]<lista[min]) {
    	min=j;}
    	}
    	if(i!=min){
    	int aux =lista[i];
    	lista[i]=lista[min];
    	lista[min] = aux;}
    		
    	}
	TFin= System.nanoTime();
		  tiempo = TFin - TInicio;
		  System.out.println("Tiempo en milisegundos para ordenar: " + tiempo);
}

static void search( int [] lista, int num) throws InterruptedException{
	boolean respt=false;
	long TInicio, TFin, tiempo;      
	TInicio = System.nanoTime();
     for (int i=0 ; i<lista.length;i++) {
		if( lista[i]==num)
			respt=true;
	}
	System.out.println(respt);
	TFin= System.nanoTime();
	  tiempo = TFin - TInicio;
	  System.out.println("Tiempo en milisegundos en buscar: " + tiempo);
}
}
