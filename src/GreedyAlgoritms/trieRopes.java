public class trieRopes {
	//2. TieRopes
	public static void main (String [] args) {
	int [] a = {1, 3, 7, 9 , 9};
	int [] b = {5, 6 , 8 , 9 , 10};
	System.out.print(solution(4, a));
}
	 public static int solution(int K, int[] A) {
	        int largo = 0, rpta=0;
	        if (A.length <1){
	            return 0;
	        }else{
	            for (int n: A) {
	                largo += n;
	                if (largo >= K) {
	                     rpta++;
	                     largo= 0;
	            }
	        }
	        }
	        return rpta;
	    }
	    
}
