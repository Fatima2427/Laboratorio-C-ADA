

import java.util.Scanner;
public class Matching{
	public static void main (String [] args)throws Exception {
		Scanner sc = new Scanner(System.in);
		StringBuilder rpta = new StringBuilder();
		int tamaño;
		while (sc.hasNextLine()) {
			String pattern =  sc.nextLine();
			String text =sc.nextLine();
			tamaño=text.length();
			if( pattern!=null && text !=null){
				if ( text.length() <pattern.length()) {
					rpta.append(" n");
				}
					for(int i=0;i<tamaño;i++){
						if( text.charAt(i)==pattern.charAt(0)) {
							String cadena = text.substring(i,i+pattern.length());
							if(cadena.equals(pattern))
								rpta.append(i).append(' ');
						
	    	  
	      }
		}
			}
				rpta.append(" n");
			}
				 System.out.println(rpta);
			
		}
		
	    
	
}