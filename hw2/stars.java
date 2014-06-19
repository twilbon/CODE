public class stars{
    public static void main(String[] args){

	int x = Integer.parseInt(args[0]);
	int r = x;
	
	for (int i = 1; i <= x ; ++i){
	   for (int j =r; j >  1 ; --j){
		System.out.print(" ");
	   }
	   for (int k = 1; k <= i; ++k){

		System.out.print("*");
	    }
	    System.out.println();
	    r = r - 1;
	}
    }
} 
