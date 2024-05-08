import java.util.Random;
import java.util.Scanner;
	public class Task1{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	Random random = new Random();

	for (int attempt = 10; attempt > 0; attempt--) {
	int number1 = random.nextInt(100);
	int number2 = random.nextInt(100);
	int answer = number1 + number2;
	System.out.println("What is " + number1 + " + " + number2 + "?");
	
	for (int counter = 0; counter < 10; counter++) {
        int userAnswer = input.nextInt();

	if (userAnswer == answer) {
          System.out.println("Correct!");
	 break;
          } else{ 
	System.out.println("Incorrect. Try again.");

	}
	
      }	
   }
 }
	
}	
