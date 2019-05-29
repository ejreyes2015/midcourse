import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;
import static org.junit.Assert.assertNotNull;
import org.junit.jupiter.api.Test;

class DiceGameTest {

	@Test
	public void diceRollTest() {
		assertNotNull(diceRoll());
		assertTrue(diceRoll() < 7);
	}

	private int diceRoll() {
		int dice = 1 + (int)(Math.random() * 6);
	    return dice;
	}

	@Test
	public void sumOfDiceTest() {
		assertNotNull(sumOfDice(3,1));
		assertTrue(sumOfDice(5,6)<13);
	}

	private int sumOfDice(int dice1, int dice2) {
		int diceSum = dice1 +dice2 ;
		return diceSum;
	}

	@Test
	public void playerRollTest() {
		assertNotNull(playerRoll());
	}
	private  int playerRoll() {
		int playerDice1 = diceRoll();
		int playerDice2 = diceRoll();
		int playerDiceTotal = sumOfDice(playerDice1,playerDice2);
		System.out.println("Your first dice is: "+ playerDice1);
		System.out.println("Your second dice is: "+ playerDice2);
		System.out.println("Your dice total is: "+ playerDiceTotal);
		return playerDiceTotal;
}
}

