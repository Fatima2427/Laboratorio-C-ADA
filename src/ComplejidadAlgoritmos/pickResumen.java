package ComplejidadAlgoritmos;
import java.util.*;
public class pickResumen {
	public static void main (String [] args) {
		String[] needle = {"f","g","y"};
		String[] haystack = {"a","b","c","d","e","f","g","h","i"};
		System.out.println(find_needle(needle,haystack));
	}	
// #5
	//what does this code ? 
	//what is the time complexity of this code?
public static boolean find_needle (String [] resumes) {//o(n`2)
		String eliminate ="top";
		while (resumes.length >1) {// o(10)                                              | n
			if ( eliminate== "top") {//o(6){
				resumes = resumes[resumes.length /2, resumes.length-1]
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
		