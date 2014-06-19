public class natNum{
	public static void main(String[] args){

		int x = Integer.parseInt(args[0]);
		int z = 0;
		int w = 0;
		if (x<0){
			System.out.println("The number you enter is not a natural number.");
		}
		else if(x==0){
			System.out.println("The number number of"+ x + " is "+ 0);
		}
		else{
		
			for(int y=1; y<=x; y++){
			
				w = 1 + z;
				z = w;	
			}
			System.out.println("The natural number of "+ x + " is " + w );
		}
	}
}
