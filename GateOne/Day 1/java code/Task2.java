import java.util.Scanner;
	public class Task2{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	int sum = 0;
	int average = 0;
	for (int i = 0; i < 10; i++){ 
	System.out.print("Enter Score: ");
	int score = input.nextInt();
	sum += score;
	}
	average = sum / 10;
	System.out.println("The average score is " + average);
}
} 
	