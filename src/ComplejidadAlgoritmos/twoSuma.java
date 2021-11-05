package ComplejidadAlgoritmos;

public class twoSuma {
	public static void main (String [] args) {
		int [] lista= {1,21,30,4,5,1,7,8,91,1};

	System.out.println(twoSum(lista));
	}
	// what is the time complexity in terms of O()?
	public static boolean twoSum(int[] list) {// n *n => O(n'2)
		for ( int i =0;i <list.length;i++) {   //     o(1)        | n
			for ( int j =0;j <list.length;j++) {//O(3)     |   n  |
				if ( i!= j && list[i] + list[j] ==10 ) {// |      |
					return true;  
				}
			}
		}
	return false;
			
	}
}