import java.text.DecimalFormat;


public class stencil{
	public static void main(String[] args){
		
		double [] row1 = new double[3];
		row1[0] = 3.0;
		row1[1] = 2.0;
		row1[2] = 4.0;
		
		double [] row2 = new double [3];
		row2[0] = 5.0;
		row2[1] = 7.0;
		row2[2] = 2.0;
		
		double [] row3 = new double [3];
		row3 [0] = 1.0;
		row3 [1] = 5.0;
		row3 [2] = 0.0;
		
		double [][] array = new double [3][];
		array[0] = row1;
		array[1] = row2;
		array[2] = row3;
		
		int rows, columns;
		columns = array[0].length;
		rows = array.length;
		for (int j=0; j< rows; j++) {
			for (int i=0; i<columns;i++) {
				System.out.print(array[j][i] + "  ");
	                }
	            System.out.println();
	            
	        }
			
		System.out.println();
		
		for (int j=0; j< rows; j++) {
			for (int i=0; i<columns;i++) {
				int count = 0;
				double sum=0;
				
				
				int k = j;
				int l = i;
		
		
				i++;
				if (i <= 2){
					count++;
					sum = sum + array[j][i];
				}
				i--;
				
				i--;
				if (i >= 0){
					count++;
					sum = sum + array[j][i];	
				}
				i ++;
				
				j++;
				if (j <= 2){
					count++;
					sum = sum + array[j][i];					
				}
				j --;
				
				j--;
				if (j >= 0){
					count++;
					sum = sum + array[j][i];					
				}
				j ++;
				
				double [] row = new double[3];
				row[i]= sum/count;
				
				 DecimalFormat df = new DecimalFormat("#.00");
				    String rowFormated = df.format(row[i]);
				System.out.print(rowFormated + " ");
	                }
	            System.out.println();
	        }
	}
}

