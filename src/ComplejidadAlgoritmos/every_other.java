
public class every_other {
	public static void main (String [] args) {
		int [] lista= {1,2,3,4,5,6,7,8,9,10};
	everyOther(lista);
	}
	// what is the time complexity of this code?
	public static void everyOther ( int [] list) {//O(n'2)

	for ( int i =0;i <list.length;i++) {//o(2n*n)
		if ( i %2 ==0) {//o(2n)
			for ( int j : list) {//o(n)
				System.out.println( list[i]+j); //1
			}
			}
		}
	}
}