public class fibo{
    public static void main(String[] args){
		int x = Integer.parseInt(args[0]);
		int f = 2;
		int t = 0;
		int r = 1;
		int fibon = 0;
		if (x == 0){
			System.out.println("The Fibonacci number of " + x + " is " + 0);
		}
		else if(x == 1){
			System.out.println("The Fibonacci number of " + x + " is " + 1);
		}
		else{
		while (f <= x){
	    	fibon = r + t;
			t = r;
			r = fibon;
			f++; 
		}
		System.out.println("The Fibonacci number of " + x + " is " + fibon);	    
    		}
	}
}
