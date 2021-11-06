import java.util.*;
public class pickResumen {
	public static void main (String [] args) {
		String[] needle = {"f","g","y"};
		String[] haystack = {"a","b","c","d","e","f","g","h","i"};
		System.out.println(pick_resume(haystack));
	}	
// #5
	//what does this code ? 
	//what is the time complexity of this code?
public static boolean pick_resume (String [] resumes) {//o(n`2)
		String eliminate ="top";
		while (resumes.length >1) {// o(10)                                              | n
			if ( eliminate== "top") {//o(6){
				resumes = resumes[resumes.length /2, resumes.length -1]		}
			    eliminate=="bottom";
			else if (eliminate =="bottom"){
				resumes = resumes[0, resumes.length /2]		
			   eliminate="top";
			   }
			}
		return resumes[0];
}
				
			}
		