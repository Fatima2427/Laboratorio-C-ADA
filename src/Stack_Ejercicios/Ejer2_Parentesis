
public class Ejer2_Parentesis {
	 public static void main(String[] args) { 
         //2. Minimum Add to Make Parentheses Valid
         //Given a string S of and , compute the minimum number of or that needs to be added so that the resulting parentheses string is valid.    
	    	String [] lista = {"(",")",")"};	
	    	operar(lista);
	    	String [] lista1= {"(","(",")",")",")","("};	
	    	operar(lista1);
	    	String [] lista2 = {"(","(","("};	
	    	operar(lista2);
	    	String [] lista3 = {"(",")",")",")","(","("};	
	    	operar(lista3);
	    	String [] lista4 = {};	
	    	operar(lista4);
	    	String [] lista5= {")",")",")","(","("};	
	    	operar(lista5);
	    }
	 static void operar ( String [] l ) {
		 Stack <String> parentesis = new Stack <String>();
		 if ( l.length>0) {
			for ( int i =0; i<l.length; i++) {
			 if (l[i]=="(") {
				 parentesis.push(l[i]);
				 }
			 else if (!parentesis.empty()){
				 segundaParte(parentesis, l, i);
				 break;
			 }
			}
		 }else if (l.length==0) {
			System.out.println("Es valido por que esta vacio ");
		 }
		 if (! parentesis.empty())
			 System.out.println("Faltaria "  + l.length  + " para ser valido");

			 
	 }
	static void segundaParte(Stack<String> parentesis, String[] l, int i) {
		for(  int j = i ;j<l.length ; j++){
			if (l[j] ==")" && !parentesis.empty()) {
				parentesis.pop();
			}else  {
				System.out.println("Faltaria " + (l.length-j) + " para ser valida");	
				break;
		}
		}
		
	}
	 
}
