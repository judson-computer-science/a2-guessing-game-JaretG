/*Jaret Godinez
9/16/21
CSC 205
from book
*/
public class GuessGame {
 Player p1;
 Player p2;
 Player p3;//Creates players
 public void startGame() {
 p1 = new Player();
 p2 = new Player();//instintiates the players
 p3 = new Player();

 int guessp1 = 0;
 int guessp2 = 0;//guess place holder
 int guessp3 = 0;
 boolean p1isRight = false;
 boolean p2isRight = false;//ability to have a false or true
 boolean p3isRight = false;
 int targetNumber = (int) (Math.random() * 10);//chooses a number
 System.out.println("I’m thinking of a number between 0 and 9...");
 while(true) {
 System.out.println("Number to guess is " + targetNumber);
 p1.guess();
 p2.guess();
 p3.guess();
 guessp1 = p1.number;
 System.out.println("Player one guessed " + guessp1);
 guessp2 = p2.number;
 System.out.println("Player two guessed " + guessp2);//retains a guess
 guessp3 = p3.number;
 System.out.println("Player three guessed " + guessp3);

 if (guessp1 == targetNumber) {
 p1isRight = true;
 }
 if (guessp2 == targetNumber) {
 p2isRight = true;
 }
 if (guessp3 == targetNumber) {
 p3isRight = true;
 }
 if (p1isRight || p2isRight || p3isRight) {

 System.out.println("We have a winner!");
 System.out.println("Player one got it right? " + p1isRight);
 System.out.println("Player two got it right? " + p2isRight);
 System.out.println("Player three got it right? " + p3isRight);
 System.out.println("Game is over.");
 break; // game over, so break out of the loop
 } else {
 // we must keep going because nobody got it right!
 System.out.println("Players will have to try again.");
 } // end if/else
 } // end loop
 } // end method
} // end class