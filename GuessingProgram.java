//Guessingprogram.java
//Yangyang Lian

import java.util.Scanner;

public class Guessingprogram {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);//create scanner instance
       //Create object of Number Guess with lower and upper bound as 1 and 100 respectively.
       NumberGuesser ng = new NumberGuesser(1,100);
       //start a do-while loop. It will keep track of each number guessing game
       do {
           System.out.print("Think of a number from 1 to 100\n");
           while(true) {//start a inner while loop till the guess is correct
               int guessedNumber = ng.getCurrentGuess();//get current guess
               System.out.print("Is the number "+guessedNumber+"? (h/l/c):");
               String input = sc.next();//get answer from user if the guess is right
               if(input.equals("h"))
                   ng.higher();//if input is h, call higher method
               else if(input.equals("l"))
                   ng.lower();//if input is l, call lower method
               else if(input.equals("c")) {//if it is c, it means guess is correct
                   System.out.println("You picked "+guessedNumber+"? Great pick.");
                   break;//so break out of inner while loop
               }else {//for any other input, it is invalid
                   System.out.println("Invalid input.");
               }
           }
           System.out.print("Do you want to play again: (y/n):");
           String playAgain = sc.next();//check if user wants to play again or not
           if(playAgain.equals("n"))//if not, then break out of the do-while loop
               break;
           else//if want to play again, then rest the current state to original state
               ng.reset();
       }while(true);
       //end message
       System.out.println("Good bye.");
      
   }

}
