import java.util.Scanner;
	public class Task1{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);

	int sumofdoubledSecondDigit = 0;
	int doubledSecondDigit = 0;

	System.out.print("Enter card number: ");
	String cardNumber = input.nextLine();

	int [] collectingNumber = new int[cardNumber.length()];	

	if (cardNumber.length() <= 16) {

	
	char cardNumberFirstDigit = cardNumber.charAt(0);


	if (cardNumberFirstDigit == '4') System.out.print("Credit card type: Visacard\n");
	
	else if(cardNumberFirstDigit == '5') System.out.print("Credit card type: Master card\n");
 	
	else if(cardNumberFirstDigit == '6') System.out.print("Credit card type: Discover card\n");
	
}
	else System.out.print("invalid number");	

}
}
	
