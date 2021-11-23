

public class Ejer5_InterviewWait {
		  public static void main(String[] args) { 
              //5. Interview Wait
              //   You are sitting on a row of chairs, waiting for an interview. When choosing the next interviewee, the interviewer will always choose from either the very left side or the very right side of the row of chairs.
              //Furthemore, the interviewer knows exactly how much time each interview will take, and being lazy, will always choose the side with the lower interview time. (You can assume that all times are distinct.)
              //You are denoted with a -1 interview time, which means that the interviewer will always pick you over the person on the opposite side. How much time will it take before the interviewer gets to you? 
                  
		    	int[] lista = {4, -1, 5, 2, 3};
		    	int respuesta =calcularTiempo(agregarDeque(lista), lista.length);
		    	System.out.println("Tiempo de espera " + respuesta);
		    	int[] lista2 = {4, 5,6,-1, 5, 2, 3,1};
		    	respuesta =calcularTiempo(agregarDeque(lista2), lista.length);
		    	System.out.println("Tiempo de espera " + respuesta);
		    }
		     static int  calcularTiempo(Deque<Integer> tiempos, int tamaño) {
		        int SumaTiempos=0;
		        for ( int i=0; i<tamaño;i++) {
		        	if(tiempos.peekBack() ==-1 || tiempos.peekFront() ==-1)
		        		break;
		        	else if (tiempos.peekBack()>=tiempos.peekFront()) {
		        		SumaTiempos+=tiempos.peekFront();
		        		tiempos.popFront();

		        	}else {
		            	SumaTiempos+=tiempos.peekBack();
		            	tiempos.popBack();
		        	}
		        }
		        return SumaTiempos;
		    }
		   static Deque<Integer> agregarDeque( int [] l) {
		    	 Deque <Integer>time = new Deque<Integer>();
		    	 for ( int i : l)
		    		 time.pushBack(i);
		    	 return time;
		     }
		}

