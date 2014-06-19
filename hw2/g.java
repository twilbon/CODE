import java.util.Scanner;

class g{
	public static void main (String[] args){
		int m, n, c, d;
		Scanner in =  new Scanner(System.in);	
		
		m = in.nextInt();
		n = in.nextInt();
		
		int first[][] = new int[m][n];
		int second[][] = new int [m][n];
		int sum[][] = new int [m][n];
		
		for (c=0; c<m ; c++){
			for (d=0; d<n; d++){
				first[c][d] = Math.random();
			}
		}
		for (c=0; c<m ; c++){
			for (d=0; d<n; d++){
				second[c][d] = Math.random();
			}
			
		}
		for ( c = 0 ; c < m ; c++ ){
	         for ( d = 0 ; d < n ; d++ ){
	             sum[c][d] = first[c][d] + second[c][d];
	
	         }
		}
		 for ( c = 0 ; c < m ; c++ )
	      {
	         for ( d = 0 ; d < n ; d++ ){
	            System.out.print(sum[c][d]+"\t");
	         
	         }
	      }
	         System.out.println();
	}
}
