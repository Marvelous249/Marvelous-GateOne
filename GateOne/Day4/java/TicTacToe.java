import java.util.Scanner;
 public class TicTacToe{
 public static void main(String[] args){
 Scanner input = new Scanner(System.in);

 char letter1 = 'x';
 char letter2 = 'o';

 for(int count = 0;count < 9;count++){
  System.out.print("Enter a number between X && O,to play the game : ");
    String userinput = input.nextLine();
if(userinput < letter1 || userinput > letter2){
System.out.println("not a valid number!!!");
count--;
}



if(userinput >= letter1  && userinput <= letter2){
System.out.println(letter1);
letter1 = letter2;


}
}








}
}
