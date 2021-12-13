
public class book {
	public static void main (String [] args) {
		//2. Book Shop
		//You are in a book shop which sells n different books. You know the price and number of pages o each book.
		//You have decided that the total price of your purchases will be at most x. What is the maximum
		//number of pages you can buy? You can buy each book at most once.

		int [ ] p = {4,8,5,3};
		int [] page = {5,12,8,1};
		System.out.println(books(p.length,10,p,page));
	}
	 public static int books(int n, int x, int []price , int []page) {
		  int[][] dp = new int[n+1][x+1];
	   for(int i=0;i<=n;i++)
	    {
	        for(int j=0;j<=x;j++)
	        {	            
	            dp[i][j] = dp[i-1][j];
	            if(j >= price[i-1])
	            {
	                dp[i][j] =  Math.max(dp[i][j],dp[i-1][j-price[i-1]] + page[i-1]);
	            }
	        }
	    }
	    return dp[n][x];
	}
}
