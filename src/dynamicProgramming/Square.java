public class Square {
	public static void main (String [] args) {
        //Given an m x n binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.
		char [][] a = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
		System.out.println(maximalSquare(a));
	}
	
    public static int maximalSquare(char[][] matrix) {
        int mayor=0;
         if (matrix != null || matrix.length > 0) {
            int f = matrix.length;//fila
            int c=matrix[0].length;//columna
            int rpta[][] = new int[f][c];
             for (int i = 0; i < f; i++){
                 for (int j = 0; j < c; j++){
                     if (i == 0 || j == 0) 
                         rpta[i][j] = matrix[i][j] - '0';
                     else if (matrix[i][j] == '0')
                         rpta[i][j] = 0;
                     else {
                         rpta[i][j] = Math.min(rpta[i][j-1], Math.min(rpta[i-1][j], rpta[i-1][j-1]))+1;
                     }
                         if (mayor < rpta[i][j]) mayor = rpta[i][j];
                 
            }
        }
         }
             return mayor*mayor;

    }
}

