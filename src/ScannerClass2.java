import java.util.Scanner;
public class ScannerClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
	    
	    Scanner text = new Scanner(System.in);

	    // if the next is boolean, print found and the boolean
	    if (text.hasNextBoolean()) {
	    	System.out.println("Found a boolean: " + text.nextBoolean());
	    }
	    
	    // if the next is a token print it
	    if (text.hasNext()) {
		    System.out.println("The first token is: " + text.next());
	    }
	    
	    // if the next is a token print the rest of the string
	    if (text.hasNext()) {
		    System.out.println("The rest of the string is: " + text.nextLine());
	    }

	    // close the scanner
	    text.close();
	}

}