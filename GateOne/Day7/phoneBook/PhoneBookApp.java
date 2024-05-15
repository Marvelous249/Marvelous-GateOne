import java.util.*;

public class PhoneBookApp {
  static Map<String, String> phoneBook = new HashMap<>();
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    while (true) {
      System.out.println("Phone Book App");
      System.out.println("1. Add Contact");
      System.out.println("2. Remove Contact");
      System.out.println("3. Find Contact by Phone Number");
      System.out.println("4. Find Contact by First Name");
      System.out.println("5. Find Contact by Last Name");
      System.out.println("6. Edit Contact");
      System.out.println("7. Exit");
      System.out.print("Choose an option: ");
      int option = input.nextInt();
      input.nextLine(); // consume newline left-over

      switch (option) {
        case 1:
          addContact();
          break;
        case 2:
          removeContact();
          break;
        case 3:
          findContactByPhoneNumber();
          break;
        case 4:
          findContactByFir3stName();
          break;
        case 5:
          findContactByLastName();
          break;
        case 6:
          editContact();
          break;
        case 7:
          System.exit(0);
          break;
        default:
          System.out.println("Invalid option. Please choose a valid option.");
      }
    }
  }

  public static void addContact() {
    System.out.print("Enter first name: ");
    String firstName = input.nextLine();
    System.out.print("Enter last name: ");
    String lastName = input.nextLine();
    System.out.print("Enter phone number: ");
    String phoneNumber = input.nextLine();
    phoneBook.put(phoneNumber, firstName + " " + lastName);
    System.out.println("Contact added successfully!");
  }


  }
}
