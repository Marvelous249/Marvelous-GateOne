import java.util.Scanner;

public class Task6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
	int average = 0;

	for (int i = 0; i < 11; i++) {
        System.out.println("Enter scores:");
            int score = scanner.nextInt();
            if (score % 2 == 0) {
                sum += score;
		average = sum/10;
            }
        }

        System.out.println("Sum of scores at even indexes: " + average);
    }
}

