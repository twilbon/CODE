import java.io.BufferedReader;
public class binary{
    public static void main(String args[]){
	int x = Integer.parseInt(args[0]);
	StringBuffer buf = new StringBuffer();
	
	while (x != 0){
	    int r = x%2;
	    x = x/2;
	    buf.append(r); 
	}
	
	buf.reverse();
	System.out.println(buf);
    }
}        
