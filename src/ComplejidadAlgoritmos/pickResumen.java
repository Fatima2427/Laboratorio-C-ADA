import java.util.*;
public class pickResumen {
	public static void main (String [] args) {

		List<String> resumes = Arrays.asList("a","b","c","d","e","f","g","h","i");
		System.out.println(pick_resume(resumes));
	}	
// #5
	//what does this code ? nos muestra el elemento central de un arreglo
	//what is the time complexity of this code?  o(n)
	public static String pick_resume (List<String> resumes) {//o(log_2n) por que en cada vuelta va reduciendo entre mitad y terminara mucho mas rapido que un o(N)
		String eliminate ="top";
		while (resumes.size() >2) {//     le puse 2 por que cuando le doy 1 me da error  y no recuerdo si debe ser asi o es error de las diapos..                  
			if ( eliminate== "top") {
				resumes =resumes.subList(resumes.size()/2, resumes.size()-1);
			    eliminate="bottom";
			    }
			else if (eliminate =="bottom"){
				resumes = resumes.subList(0, resumes.size()/2);
			   eliminate="top";
			}
		}
		return resumes.get(0);
}

				
}
	