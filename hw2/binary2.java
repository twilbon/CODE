public class binary2 {
	public static void main(String args[]){
		int x = Integer.parseInt(args[0]);
		if(x >= 128){
			System.out.print(1);
			x = x - 128;
		}
		else{
			System.out.print(0);
		}
		if (x >=64){
			System.out.print(1);
			x = x - 64;
		}
		else{
			System.out.print(0);
		}
		if (x >=32){
			System.out.print(1);
			x = x - 32;
		}
		else{
			System.out.print(0);
		}
		if (x >=16){
			System.out.print(1);
			x = x - 16;
		}
		else{
			System.out.print(0);
		}
		if (x >=8){
			System.out.print(1);
			x = x - 8;
		}
		else{
			System.out.print(0);
		}
		if (x >=4){
			System.out.print(1);
			x = x - 4;
		}
		else{
			System.out.print(0);
		}
		if (x >=2){
			System.out.print(1);
			x = x - 2;
		}
		else{
			System.out.print(0);
		}
		if (x >=1){
			System.out.print(1);
			x = x - 1;
		}
		else{
			System.out.println(0+"");
		}
}
}
