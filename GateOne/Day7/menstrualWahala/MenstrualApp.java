import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class MenstrualApp {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Menstrual Tracker App");

    System.out.print("Enter your first day of of ur period(yyyy-MM-dd): ");
    String userInput= input.nextLine();

    System.out.print("Enter the last date of ur period(yyyy-MM-dd): ");
    String userInput2 = input.nextLine();

    System.out.print("How many days ve ur period lenght: ");
    int userInput3 = input.nextInt();

    LocalDate lenghtOfCycle = LocalDate.parse(userInput);
    LocalDate lenghtOfCycle2 = LocalDate.parse(userInput2);

    Period difference = Period.between( lenghtOfCycle , lenghtOfCycle2 );
    
    LocalDate nextMenstrualCycleStart = lenghtOfCycle2.plusDays(userInput3);
    LocalDate nextMenstrualCycleEnd = lenghtOfCycle2.plusDays(userInput3+difference.getDays());

    int diff = Period.between(nextMenstrualCycleStart,nextMenstrualCycleEnd).getDays();

	
    int ovulationDay = userInput3 / 2;
    
    System.out.println("lenght of cycle " + difference);
    
    System.out.println("next menstrual cycle " + nextMenstrualCycleStart);

    System.out.println("overnlationDay " + nextMenstrualCycleStart.plusDays(ovulationDay));
  }
//"yyyy-MM-dd"
//01/04/2024 - 04/04/2024
//3days 
//29days

}
