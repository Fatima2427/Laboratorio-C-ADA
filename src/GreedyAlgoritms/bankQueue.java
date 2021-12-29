

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class bankQueue {//cliente del banco
		public int dinero;
		public int tiempo;
		public bankQueue(int d, int t) {
			this.dinero=d;
			this.tiempo=t;
		}
		public int mayorTiempo(bankQueue a ) {
			if ( this.tiempo > a.tiempo) {
				return this.tiempo;
			}
			return a.tiempo;
		
}
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
			int cantidad =  sc.nextInt();
			int tiempoTotal =sc.nextInt();
			ArrayList< bankQueue>queue = new ArrayList <bankQueue>();//banco
			System.out.println("ingrese dinero " + cantidad);
			for ( int i=0 ; i<cantidad ;i ++) {
				System.out.println(i);				
				queue.add(new bankQueue(sc.nextInt(),sc.nextInt()));
			}  
			System.out.println(solution(tiempoTotal,queue));
	}

public static int solution(int K, ArrayList< bankQueue>queue) {
    int money=0, time=0;
    if (queue.size() <1){
        return 0;
    }else{
		int MoreDinero=0;
        for (bankQueue a: queue) {
            time += a.tiempo;
            money+= a.dinero; 
            if (time >= K) {
                 MoreDinero=money ;
                 time = 0;
        }
    }
        return MoreDinero;
    }
    
}
}
		
	    
	