

public class maxArea {
	public static void main (String [] args) {
		String [][] G= {{"0","0","1","0","0","0","0","1","0","0","0","0","0"},{"0","0","0","0","0","0","0","1","1","1","0","0","0"},{"0","1","1","0","1","0","0","0","0","0","0","0","0"},
				{"0","1","0","0","1","1","0","0","1","0","1","0","0"},{"0","1","0","1","1","0","0","1","1","1","0","0","0"},
				{"0","0","0","0","0","0","0","0","0","0","1","0","0"},{"0","0","0","0","0","0","0","1","1","1","0","0","0"},{"0","0","0","0","0","0","0","1","1","0","0","0","0"}};
		
		boolean [][] visited = new boolean [G.length][G[0].length];
		mostrar(G);
		

		mostrar(visited);
		
		int area=0;
		int areaActual=0;
		for (int i = 0; i < G.length; i++) {
	        for (int j = 0; j < G[0].length; j++) {
	        	if ( G[i][j]=="1")
	        		DFS_recursive( G,visited , i, j, area);
	        	if( area >areaActual)
	        		area=areaActual;
	        }
	        	
	        }
		System.out.println("--------------------");
		mostrar(G);
		System.out.println("area mayor " + area );
	}
	public static void DFS_recursive( String [][] G,boolean [][] visited , int x, int y, int contador) {	
		if (x < 0 || y < 0 || visited[x][y]!=false || x > G.length || y > G[0].length|| G[x][y] == "0") {
			contador--;
		 return;
		}   
		else {
			contador++;
			visited[x][y]=true;
			G[x][y]="3";
			
	            	DFS_recursive( G, visited , x+1, y, contador);
	            	DFS_recursive( G, visited , x, y+1,contador);
	            	DFS_recursive( G, visited , x-1, y,contador);
	            	DFS_recursive( G, visited , x, y-1,contador); 
	            	System.out.println(contador);
	            	
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
