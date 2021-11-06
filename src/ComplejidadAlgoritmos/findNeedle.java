public class findNeedle {
	public static void main (String [] args) {
		String[] needle = {"f","g","y"};
		String[] haystack = {"a","b","c","d","e","f","g","h","i"};
		System.out.println(find_needle(needle,haystack));
	}	

	// what is the time complexity of this code?
public static boolean find_needle (String [] needle, String [] haystack) {//o(n`2)
		int needle_index= 0;
		int haystack_index=0;
		boolean found_needle= false;
		while (haystack_index < haystack.length) {// o(10)                                              | n
			if ( needle[needle_index] == haystack[haystack_index]) {//o(6){
				found_needle=true;
				while (needle_index<needle.length) { // o(4 )                                 |n        |
					if( needle[needle_index] != haystack[haystack_index+ needle_index])  //   |         |
						found_needle=false;                                               //  |
				 needle_index+=1;//	o(1)                                                      |
				 }
		    }
			if (found_needle) // o(2)
				return true ;
			needle_index=0; //o(1)
			haystack_index+=1;//o(1)
		}
		return false;
}
				
			}
		