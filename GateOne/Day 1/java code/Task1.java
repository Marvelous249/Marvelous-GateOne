import java.util.Scanner;
	public class Task1{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	int sum = 0;
	for (int i = 0; i < 10; i++){ 
	System.out.print("Enter Score: ");
	int score = input.nextInt();
	sum += score;
	}
	System.out.println("The total score is " + sum);
}
} 
	