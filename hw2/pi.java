class pi {
	public static void main(String[] args){
		int darts = 10000;
		int i = 1;
		int Nc = 0;
		int Ns = 0;
		
		while (darts<=100000){
		do{
			double x = Math.random()*2-1;
			double y = Math.random()*2-1;

			if (Math.pow(x, 2) + Math.pow(y, 2)<=1){
				Nc = Nc + 1;
			}
			else{
				Ns = Ns + 1;
			}
			i++;
			
		} while(i<=darts);
		double pi = 4.0 * Nc/(Nc + Ns);
		System.out.println(pi);
		
		darts = darts + 10000;
		}
		}
	
}
