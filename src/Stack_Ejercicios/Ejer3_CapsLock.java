
public class Ejer3_CapsLook {
	public static void main(String[] args) {     
		//3. Caps Lock
		//You are sending a message to a friend with a special keyboard. The keyboard only accepts lowercase letters, and stores them in a buffer.
		//When the @ key is pressed, it toggles the CapsLock key: all letters in the buffer have their case flipped, as well as all subsequent keypresses. When the $ key is pressed, the entire buffer is flushed.
    	char [] lista = {'a','b','c','$','d','@','e','f','$','@','g','$'};
    	insertar (lista);
    	System.out.println(lista[1]);
    }
     static void  insertar(char[] input) {
        Queue <Character> buffer = new Queue<Character>();
        Queue<Character>   rpta = new Queue<Character>();
        for ( int i=0; i<input.length;i++) {
        	int posicion =  signos(input[i]);
        	if (posicion != -1 )
        		operar(buffer,rpta, posicion, input);
        	else
            	buffer.push(input[i]);
        }
        mostrar(rpta);
        }
     static int signos (char l) {
    	 char [] listaSignos = {'$', '@'};
    		 for ( int j = 0; j<listaSignos.length ; j++) {
    			 if( l ==listaSignos[j]) { return j;} 
     }
    	 return -1;
     }
	static void operar(Queue<Character> buffer,Queue<Character> rpta ,int pos, char[] input) {
		switch(pos) {
		case 0: 
			while (!buffer.empty()){
				rpta.push(buffer.peek());
				buffer.pop();
			}
			break;
		case 1: 
			if (!Character.isUpperCase(input[0] )) {
				while (!buffer.empty()){ 
					rpta.push(Character.toUpperCase(buffer.peek()));
					buffer.pop();
				}
				convertir(input,1);
				break;
			}else {
				while (!buffer.empty()){ 
					rpta.push(Character.toLowerCase(buffer.peek()));
					buffer.pop();
			}
				convertir(input,0);
				break;
		}	}
	}
	static void  convertir(char[] input, int n) {
		if ( n ==0){
			for (int i =0; i <input.length;i++)
				input[i]=Character.toLowerCase(input[i]);
		}else{
			for (int i =0; i <input.length;i++)
				input [i]=Character.toUpperCase(input[i]);
		}
	}
	static void  mostrar(Queue<Character> rpta ) {
		while (!rpta.empty()) {
			System.out.println(rpta.peek());
			rpta.pop();
		}
	}
}
