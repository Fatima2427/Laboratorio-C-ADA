
import java.util.ArrayList;
import java.util.Scanner;

public class shortest {
    /*
    Shortest Routes I
There are n cities and m flight connections between them. Your task is to determine the length of the shortest route from Syrjälä to every city.

    */
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
			int ciudades =  sc.nextInt();
			int caminos =sc.nextInt();
			int [][] grafo = new int [ciudades][ciudades];
		
			for ( int i=0 ; i<caminos ;i ++) {
				int a=sc.nextInt();
				int b=sc.nextInt();
				int c =sc.nextInt();
				if (grafo[a-1][b-1] !=0 || a==b) {
					if (grafo[a-1][b-1] >c) {
						grafo [a-1][b-1]=c;
					grafo [b-1][a-1]=c;
					}
			}  else {
				grafo [a-1][b-1]=c;
				grafo [b-1][a-1]=c;
			}
			}
			solution(grafo);
	}

	 static void solution(int[][] dist) {
		int V= dist.length;
		 for (int k = 0; k < V; k++)
	        {
	            for (int i = 0; i < V; i++)
	            {
	                for (int j = 0; j < V; j++)
	                {
	                	int camino =dist[i][k] + dist[k][j] ;
	 	                    if (camino < dist[i][j] && camino!=0)
	                        dist[i][j] = dist[i][k] + dist[k][j];
	                }
	            }
	        }
		mostrar( dist);
	}

	static void mostrar(int[][] dist) {
		  for (int i = 0; i < dist.length; i++){
			  System.out.print(dist[0][i] +" ");
		  
	        }
	}
	

}
