
import java.util.Stack;

public class bfs_grapho {
	public static void main (String [] args) {
			// Ejercicios 2:  Estás en una cuadrícula de 5 x 5. Si solo puede moverse directamente hacia arriba / abajo / izquierda / derecha, ¿cuál es la menor cantidad de pasos que le permitirá llegar a cada celda de la cuadrícula?
	
		String [][] G= {{"-1","-1","-1","-1","-1","-1"},{"-1","-1","-1","-1","-1","-1"},{"-1","-1","-1","-1","-1","-1"},
				{"-1","-1","-1","-1","-1","-1"},{"-1","-1","-1","-1","-1","-1"},{"-1","-1","-1","-1","-1","-1"}};
		boolean [][] visited = new boolean [G.length][G[0].length];
		mostrar(G);
		
		bfs(G,visited,2,1);
		mostrar(G);
		mostrar(visited);
	}
	public static void bfs( String [][] G,boolean [][] visited , int x, int y) {
		Stack <Integer> valor_x = new Stack<Integer> ();
		Stack <Integer> valor_y = new Stack<Integer> ();
		valor_x.push(x);
		valor_y.push(y);
		visited[x][y]=true;
		G[x] [y]="0";
		int contador =1;
		while (contador<4) {
			int a=valor_x.peek();
			int b=valor_y.peek();
			valor_x.pop();
			valor_y.pop();
			System.out.println(a +"." + b);
			if (a < 0 || b < 0 || visited[a][b]!=false || a>= G.length || b >= G[0].length)
		        return;
			if(visited[a+1][ b] ==false) {
		  		valor_x.push(a+1);
				valor_y.push(b);
				visited[a+1][ b] =true;
				G[a+1] [b]=String.valueOf( contador);}
		  	if(visited[a][ b-1] ==false) {
		  		valor_x.push(a);
				valor_y.push(b-1);
				visited[a][ b-1] =true;
				G[a+1] [b-1]=String.valueOf( contador);
		  	}if(visited[a][ b+1] ==false) {
		  		valor_x.push(a);
				valor_y.push(b+1);
				visited[a][ b+1] =true;
				G[a] [b+1]="0";
				
		  	}if(visited[a-1][ b] ==false) {
		  		valor_x.push(a-1);
				valor_y.push(b);
				visited[a-1][ b] =true;
				G[a-1] [b]=String.valueOf( contador);
		  	}
        	contador++;
		}
	}
	public static void mostrar( String [][] G) {
		for (int i = 0; i < G.length; i++) {
	        for (int j = 0; j < G[0].length; j++) {
	        	System.out.print(G[i][j] + ",");
	        }
	        System.out.println();
	        	
	        }
	}
	public static void mostrar( boolean [][] G) {
		for (int i = 0; i < G.length; i++) {
	        for (int j = 0; j < G[0].length; j++) {
	        	System.out.print(G[i][j] + ",");
	        }
	        System.out.println();
	        	
	        }
	}
}
