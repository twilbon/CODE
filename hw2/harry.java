import java.util.Arrays;
class harry{
	public static void main(String[] args){
	
	int arraySize = 5;
	double [] array =  new double [arraySize];
	
	for (int i = 0; i <arraySize; ++i){
		array[i] = Math.random();
	}

	System.out.println(Arrays.toString(array));
	
	int length1 = 6;
	int length2 = 3;
	double[][]twoArray = new double [length1][];
	for (int i = 0; i < length1; ++i){

	twoArray[i] = new double[length2];
	}

	for (int i = 0; i <length1; ++i){
		for(int j = 0; j <length2; ++j){
			twoArray[i][j] = Math.random();
		}
	}
	
	}

	public static void multiply(double[][] mat1, double[][] mat2){
		
	}
	public static void printATwoDimensionalArray(double[][] array){
	int length1 = array.length;
	int length2 = array[0].length;

	for (int i = 0; i < length1; ++i){
		for (int j = 0; j < length2; ++j){
			System.out.print(array[i][j] + " ");
		}
		System.out.println();
		System.out.println();
	}
	}
}
