import java.util.Scanner;
public class SimpleLoop{
    public static void main(String[] args){
	
	int myNumber, theNumber;
	Scanner myNum = new Scanner(System.in);
	myNumber = myNum.nextInt();

	for(theNumber = 1; theNumber!= myNumber; theNumber++){
	    System.out.println(theNumber);
	}
    }
}
