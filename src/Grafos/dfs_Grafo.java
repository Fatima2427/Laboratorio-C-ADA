
import java.util.*;
public class dfs_Grafo {
	public static void main (String [] args) {
		String [][] G= {{"#","#","#","#","#","#"},{"#","0","0","0","0","#"},{"#","0","0","0","0","#"},
				{"#","0","0","0","0","#"},{"#","0","0","0","#","0"},{"#","#","#","#","0","0"}};
		
		boolean [][] visited = new boolean [G.length][G[0].length];
		mostrar(G);
		
		DFS_recursive(G,visited,2,1);
		mostrar(G);
		mostrar(visited);
		
	}
	public static void DFS_recursive( String [][] G,boolean [][] visited , int x, int y) {
		
		if (x <= 0 || y <= 0 || visited[x][y]!=false || x >= G.length || y >= G[0].length|| G[x][y] == "#") //sirve para que el valor de  x, y no se salgan del rango debido como exceder el largo , tbm nos aseguramos que no este visitado o que no contenga "#"
	        return; 
		else {
			visited[x][y]=true;
			G[x][y]="3";
	            	DFS_recursive( G, visited , x+1, y);//derecha
	            	DFS_recursive( G, visited , x, y+1);//abajo
	            	DFS_recursive( G, visited , x-1, y);//isquierda
	            	DFS_recursive( G, visited , x, y-1);  //arriba
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
