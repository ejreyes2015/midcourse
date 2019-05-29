import java.util.*;

public class DiceGame {

	public static void main(String[] args) {
		playGameUserChoice();

	}
		  //Creates and returns a random number between 1-6 for the dice. 
		   public static int diceRoll(){
		       int dice = 1 + (int)(Math.random() * 6);
		       return dice;
		   }

		   //Adds and returns the sum of two dice.
		   public static  int sumOfDice(int dice1, int dice2) {
			   int diceSum = dice1 +dice2 ;
			   return diceSum;
		   }
		   
		   //Assigns two dice for the player, adds the dice together, displays the dice values and returns the value.
		   public static int playerRoll() {
			   int playerDice1 = diceRoll();
			   int playerDice2 = diceRoll();
			   int playerDiceTotal = sumOfDice(playerDice1,playerDice2);
			   System.out.println("Your first dice is: "+ playerDice1);
			   System.out.println("Your second dice is: "+ playerDice2);
			   System.out.println("Your dice total is: "+ playerDiceTotal);
			   return playerDiceTotal;
		   }
		   
		   //Takes in user input to initiate the game in a try catch block.
		   public static void playGameUserChoice() {
			   try {
			   Scanner scan1 = new Scanner(System.in);
			   System.out.println("Hi, Do you want to play a dice game? 1 for Yes or 2 for No ");
			   int userResponse = scan1.nextInt();
			   if (userResponse == 1) {
				   gamePlay();
			   }
			   
			   else if (userResponse == 2) {
				   System.out.println("That's a shame, maybe we can play next time.");
			   }
			   
			   scan1.close();
			   
			   if ((userResponse != 1) && (userResponse !=2)) {
					 System.out.println("You typed in an invalid option.");  
				   }
			   }
			   
			   catch(Exception invalid) {
				   System.out.println("There seems to be a problem. Try again");
			   }
		   }
		   
		   //Game logic 
		   public static void gamePlay() {
			    int player1stRoll = playerRoll();
			   
			    if ((player1stRoll == 7) || (player1stRoll == 11)) {
			    	System.out.println("You rolled a "+ player1stRoll+ "."+"\n" + "You win!");
			    }
			    
			    else if ((player1stRoll == 2) || (player1stRoll == 3) || (player1stRoll == 12)) {
			    	System.out.println("You rolled a "+ player1stRoll+ "."+"\n" +"You lose!");
			    }
			    
			    else {
			    	int point = 0;
			    	while ((player1stRoll != point) && (point != 7)) {
			    		int endlessRoll = sumOfDice(diceRoll(),diceRoll());
			    		point = endlessRoll;
			    		System.out.println("You rolled a "+ endlessRoll +". " + "POINT is " + player1stRoll + ".");
			    	}
			    		if (point == player1stRoll) {
			    	    	System.out.println("You win!");}
			    	    
			    		if (point == 7) {
			    			System.out.println("You lose!");
			    		}
			    		}
			    	   
			    	
			    }
		   }
			    
	