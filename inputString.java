import java.util.*;

public class inputString { // class for main portion of code that asks user for input and contains loops 
	
	static void inputString(String enter) throws invalidLength { // method to check length of user inpur string 
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a string with 5-25 characters: "); 
		
		
		
		
		enter=input.nextLine();
		
		int length = enter.length();
		if (length < 5|| length>25) {
			throw new invalidLength("Invalid entry. Please enter a string between 5-25 charcters long");
			
			}
		else {
			 StringBuffer a = new StringBuffer(enter);
			 System.out.print("Here is your string in reverse: ");
		     System.out.println(a.reverse());
			}
			
			
			System.out.println();
			System.out.print("Would you like to enter another string?");
			enter=input.nextLine();
			if (enter.equalsIgnoreCase("yes")) {
				inputString(enter);
			}
			else {
				System.out.println("Thank you for using the reverse string generator!");
				System.exit(0);
			}
			
				
			
		}
				   
	
	
}



