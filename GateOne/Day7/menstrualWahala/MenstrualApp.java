import java.util.Scanner;

public class MenstrualApp {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Menstrual Tracker App");

    System.out.print("Enter your last period date (dd/mm/yyyy): ");
    String lastPeriodDate = input.next();

    System.out.print("Enter your average cycle length (in days): ");
    int cycleLength = input.nextInt();

    System.out.println("Your next period is expected on: " + getNextPeriodDate(lastPeriodDate, cycleLength));
  }
 
}
