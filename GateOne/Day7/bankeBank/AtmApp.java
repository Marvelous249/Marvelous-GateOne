import java.util.Scanner;

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

	if (pin.lenght > 4){
		System.out.print("Enter a 4-digit pin!!!!: ");
	pin = input.nextLine();
	}

	 char firstInitial = firstName.charAt(0);

	 String lastNameInitials = lastName.substring(0, Math.min(5, lastName.length()));


	String userId = firstInitial + lastNameInitials + pin;

        return userId;
    
	 
}
	 public static String createUserAccount(String firstName, String lastName, String pin) {
       

	System.out.println("User ID: " + userId);

}
}