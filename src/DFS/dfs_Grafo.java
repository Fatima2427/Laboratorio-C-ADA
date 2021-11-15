
import java.util.*;
public class dfs_Grafo {
		public static void main (String [] args) {
		String [][] G= {{"#","#","#","#","#","#"},{"#","0","0","0","0","#"},{"#","0","0","0","0","#"},
				{"#","0","0","0","0","#"},{"#","0","0","0","#","0"},{"#","#","#","#","0","0"}};
		
		boolean [][] visited = new boolean [G.length][G[0].length];
		
	}
	public void DFS_recursive( String [][] G,boolean [][] visited , int x, int y) {
		visited[x][y]=true;
		for (int i = 0; i < x; i++) {
	        for (int j = 0; j < y; j++) {
	            if (visited[i][j] == false && G[x][y].equalsIgnoreCase("0")) {
	            	DFS_recursive( G, visited , x, y);
	            }
	        }
		}
	}
}
