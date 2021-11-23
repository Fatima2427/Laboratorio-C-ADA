
public class Ejer4_backspace {
	  public static void main(String[] args) {     
	    	char[] lista = {'a','b','c','#','d','e','#','#','f','#','g','h','i','#','j','k','l','m','n','#','o','p','#'};
	    	insertar (lista);
	    	
	    }
	     static void  insertar(char[] input) {
	        Deque <Character> backSpace = new Deque<Character>();
	        for ( int i=0; i<input.length;i++) {
	        	if (input[i]=='#' )
	        		backSpace.popBack();
	        	else
	            	backSpace.pushBack(input[i]);;
	        }
	        
	        mostrar(backSpace);
	    }
	     static void  mostrar(Deque<Character> backSpace ) {
	 		while (!backSpace.empty()) {
	 			System.out.print(backSpace.peekFront()+ " ");
	 			backSpace.popFront();
	 		}
	 	}
	}
