import java.util.Random;
import java.util.Scanner;
public class Rock_Paper_Scissors {
 public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 while(true) {
 String[] RockPaperScissors = {"rock", "paper","scissors"};
 String OtherPlayer = RockPaperScissors[new Random().nextInt(RockPaperScissors.length)];
 /* created 2 strings RockPapSciss takes 1 of the 3 inputs and randomizes the result. OtherPlayer 
outputs the randomized input */
 
 String UserPick;
 /* The statement below "While (true)" verifies whether the user input one of the appropriate answers 
to play the game, once that requirement is met, the loop is breaks and iterates through the next loop 
*/ 
 
 while(true) {
 System.out.println("Rock Paper Scissors?");
 UserPick = scanner.nextLine();
 if (UserPick.equals("rock") || UserPick.equals("paper") || UserPick.equals("scissors")) {
 break; 
 } 
 System.out.println(" Please type Rock, Paper or Scissors"); 
 }
 /*prints out player selection */
 System.out.println("Other player threw out: " + OtherPlayer); 
 
 if (UserPick.equals(OtherPlayer)) {
 System.out.println("Same move, Tie");
 } 
 /* result of userPick and OtherPlayer outputting the same string.*/
 
 else if (UserPick.equals("rock")) {
 if (OtherPlayer.equals("paper")) {
 System.out.println("Paper beats Rock");
 } else if (OtherPlayer.equals("scissors")) {
 System.out.println("Rock beats Scissors, you win!");
 }
 } /* If userPick is Rock, it iterates through the possible ouputs of OtherPlayer and prints the 
results of the match */
 else if (UserPick.equals("paper")) {
 if (OtherPlayer.equals("rock")) {
 System.out.println("Paper beats Rock, you win!");
 
 } else if (OtherPlayer.equals("scissors")) {
 System.out.println("Scissors beats Paper");
 }
 } /* If userPick is Paper, it iterates through the possible ouputs of OtherPlayer and prints the results 
of the match */
 else if (UserPick.equals("scissors")) {
 if (OtherPlayer.equals("rock")) {
 System.out.println("Rock beats Scissors");
 } else if (OtherPlayer.equals("paper")) {
 System.out.println("Scissors beats Paper, you win!");
 }
 }
 System.out.println("Would you like to play again? yes or no?");
 String replay = scanner.nextLine();
 if (!replay.equals("yes")) {
 break;
 }
 }
 }
}
