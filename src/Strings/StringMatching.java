
import java.util.ArrayList;
import java.util.Scanner;
public class Matching{
	public static void main (String [] args)throws Exception {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		int tamaño;
		//while (sc.hasNextLine()) {
			list.add("p");
			list.add("Popup");
			list.add("helo");
			list.add("Hello there!");
			 list.add("peek a boo");
			 list.add("you speek a bootiful language");
	list.add("anas");
	list.add("bananananaspaj");
			rpta( list);
	}
	static void rpta(ArrayList<String> list ) {
		StringBuilder rpta = new StringBuilder();
		for ( int i=0 ; i<list.size() ; i+=2) {
			
			String pattern =list.get(i);
			String text = list.get(i+1);
			int tamaño=text.length();
			if( pattern!=null && text !=null){
				
				for(int j=0;j<tamaño;j++){
						if( text.charAt(j)==pattern.charAt(0) && tamaño - (j+pattern.length())>=0) {
							String cadena = text.substring(j,j+pattern.length());
							if(cadena.equals(pattern))
								rpta.append(j).append(" ");
						
	    	  
	      }
			}
				rpta.append("\n");
			}
			
		}
		System.out.print(rpta);
		}
	
	
	
	}

