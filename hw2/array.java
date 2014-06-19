
public class array{
	public static void main(String[] args){
	
	System.out.println();
	
	//Matrix One
	int L1 = 4;
	int L2 = 2;
	double [][] array1 = new double [L1][L2];
	
	for (int j = 0; j < L1; ++j){
		for (int i = 0; i < L2; ++i){
			array1 [j][i] = Math.random();
		}	
	}
	   int  i, j;
             	print(array1);
		System.out.println();
		System.out.println(" X ");
	        System.out.println();

	//Matrix Two
	int K1 = 2;
        int K2 = 3;
        double [][] array2 = new double [K1][K2];

        for (j = 0; j < K1; ++j){
                for (i = 0; i < K2; ++i){
                        array2 [j][i] = Math.random();
                }
        }
			System.out.println();
                        System.out.println();
			print(array2);
	
	if (L2 == K1){
	 multiply(array1, array2); 
	
	}

	else{
	System.out.print("The matrices does not match columns and rows.");
	return;
	}
	
		
}

	public static double [][] multiply(double mat1 [][], double mat2 [][]){
		int mat1rows = mat1.length;
		int mat1cols = mat1[0].length;
		int mat2rows = mat2.length;
		int mat2cols = mat2[0].length;


		double [][] end = new double [mat1rows][mat2cols];

		for (int i = 0; i <mat1rows; i++){
			for (int j = 0; j <mat2cols; j++){
				for (int k=0; k < mat1cols; k++){
					end [i][j] += mat1 [i][k] * mat2 [k][j];
				}
			}
		}
		System.out.println("The Answer is ");
		array.print(end);
		return end;	
	}

	public static void print(double [][] array){
		int length1 = array.length;
		int length2= array[0].length;
		System.out.println();
	
		for (int i = 0; i < length1; i++){
			for (int j = 0; j < length2; j++){
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
