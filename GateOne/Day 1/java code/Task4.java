import java.util.Scanner;

public class Task4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter 10 scores:");
        for (int i = 100; i  > 90 ; i--){
            int score = scanner.nextInt();
            if (i % 2 == 0) {
                sum += score;
            }
        }

        System.out.println("Sum of scores at even indexes: " + sum);
    }
}

