
public class Ejer1_RPN {
    public static void main(String[] args) {     
        //1. Evaluate Reverse Polish Notation
        // Reverse Polish Notation (RPN) Writing “2 3 +” instead of “2+3”. Valid operators are +, -, *, /. Each operand may be an integer or another expression
    	String [] lista = {"2","1","+","3","*"};
    	insertar (lista);
    	String [] lista1 = {"4","13","5","/","+"};
    	insertar (lista1);
    	String [] lista2 = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
    	insertar (lista2);
    	
    }
     static void  insertar(String[] input) {
        Stack <Integer> RPN = new Stack<Integer>();//solo guardaremos los numeros
        for ( int i=0; i<input.length;i++) {
        	int posicion =  signos(input[i]);
        	if (posicion != -1 )// indica que no es un signo sino un numero ( solo estoy considerando 2 tipos de elementos : o es un signo o es un numero)
        		operar(RPN, posicion);//comprobado que es un simbolo procedemos a realizar la operacion  enviando la posicion que se obtuvo de la lista de signos
        	else
            	RPN.push(Integer.parseInt(input[i])); //convertimos a numero y lo agregamos
        }
        System.out.println("Respuesta " +RPN.peek());//respuesta final sera el unico elemento que quede en nuestra pila 

    }
     static int signos (String l) { //arrojara la posicion del signo que nos servira para posteriormente realizar la operacion, si no lo encuentra arrojara un -1
    	 String [] listaSignos = {"/", "*", "+", "-"};
    		 for ( int j = 0; j<listaSignos.length ; j++) {
    			 if( l ==listaSignos[j]) { return j;} 
     }
    	 return -1;
     }
	static void operar(Stack<Integer> pila ,int pos) {//con la posicion usaremos switch para saber que operacion le corresponderia
		int num1 = pila.peek();//guardamos el numero que esta en la cima
		pila.pop(); //eliminamos para ir abajo
		int num2 =pila.peek(); //guardamos el nuevo numero que esta arriba
		pila.pop();//eliminamos el numero superior para ir abajo y posteriormente insertar nuestro resultado
		switch(pos) {
		case 0: 
			pila.push(num2/num1);
			break;
		case 1: 
			pila.push(num2*num1);
			break;
		case 2: 
			pila.push(num2+num1);
			break;
		case 3: 
			pila.push(num2-num1);
			break;
			
		}
		
		
	}
}
