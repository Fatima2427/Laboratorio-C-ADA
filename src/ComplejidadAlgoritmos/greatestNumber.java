
public class greatestNumber {
	public static void main(String [] args) {
		int []  lista= {1,4,8,2,5,9};
		greatestNumber(lista);
		System.out.println(greatestNumberOn(lista));
	}
	// convert from o(n'2) to o(n)
	public static void greatestNumber(int []lista) { //O(n'2)
		for (int i: lista) {
			boolean mayor= true;
			for (int j : lista) {
				if (j>i) 
					mayor= false;
				} 
			if (mayor == true) {
				System.out.println(i);}
		}
	}
	public static int greatestNumberOn( int [] lista ) { // O(n)
		int valorMayor =lista[0];
		for (int i =0 ; i< lista.length ; i++) {
			if ( lista[i] >valorMayor)
				valorMayor= lista[i];
			}
		return valorMayor;
	}
	
}
