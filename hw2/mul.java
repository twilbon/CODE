public class mul{
	public static void main(String[] args){

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int mul = 0;
		if (num2==1){
			
			mul = num1 * 1;
			System.out.println(mul);
		}
		else if(num2 == 0){
			mul = num1* 0;
			System.out.println(mul);
		}
		else{
	
			for(int count = 1; count<=num2; count++){
				mul = num1 + mul;
			}
			System.out.println(mul);
		}
	}
}
