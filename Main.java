
public class Main { // main class to start program and hold try catch functions
	public static void main(String[]args) {
		try {
			inputString start= new inputString();
			start.inputString(null);
			
		}
		catch (invalidLength ex) {
			System.out.println("Exception found: " + ex);
		}

	
	}

}
