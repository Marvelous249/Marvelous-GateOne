import java.util.*;

public class AtmApp{
	public static void main(String... main){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter your first name: ");
	String firstName = input.nextLine();

	System.out.print("Enter your last name: ");
	String lastName = input.nextLine();

	System.out.print("Enter a 4-digit pin: ");
	String pin = input.nextLine();
	
	String userId = createUserAccount(firstName, lastName, pin);

	while(pin.length() != 4 || !pin.matches("\\d+")){
		System.out.print("Try again enter a 4-digit pin!!!!: ");
	pin = input.next();
	}

	System.out.println("User ID: " + userId);

}
	 public static String createUserAccount(String firstName, String lastName, String pin) {


	 char firstInitial = firstName.charAt(0);

	 String lastNameInitials = lastName.substring(0, Math.min(5, lastName.length()));


	String userId = firstInitial + lastNameInitials + pin;

        return userId;

	
}
}