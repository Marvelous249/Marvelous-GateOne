import java.util.Scanner;
	public class Task1{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	char letter = 'X';
	char alphabet = 'O';
	
		System.out.println("       Welcome to Marvelous Game of Tic Tac Toe");
			
			for (int attempt = 100; attempt > 91; attempt--) {
			System.out.println("Enter X or O to play the game");
			String userinput = input.nextLine();	
}
			char[][] board = new char[3][3];
  			char currentPlayer = 'X';

  			void printBoard() {
    			for (char[] row : board) {
      			for (char cell : row) {
        		System.out.print(cell + " ");
      }
}
}


	System.out.print("    Thanks for playing ▶"); 
     }
}
	
	