class Solution {
    //1. Unique Path II
    //A robot is located at the top-left corner of a m x n grid.
//The robot can only move either down or right at any point in time.
//The robot is trying to reach the bottom-right corner of the grid

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
    int n = obstacleGrid[0].length;
    int[][] rpta = new int[m][n];
    rpta[0][0] = obstacleGrid[0][0]==0 ? 1:0;
    if ( n<=100 && m>=1){
        if(rpta[0][0] == 0) return 0;
        for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(obstacleGrid[i][j] == 1)
                rpta[i][j] = 0;
            else if(i==0 || j==0){
                if(j>0) 
                    rpta[i][j] = rpta[i][j-1];
                else if(i>0)
                    rpta[i][j] = rpta[i-1][j];
            }
            else rpta[i][j] = rpta[i-1][j] + rpta[i][j-1];
        }
    } return rpta[m-1][n-1];