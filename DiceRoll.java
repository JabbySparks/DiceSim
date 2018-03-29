import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

public class DiceRoll {
	public static void main(String[] args){
		int maxDieSize, diceQuantity;
		boolean isRolling = true;
		Scanner reader = new Scanner(System.in);
		while(isRolling){
			System.out.println("Hello and Welcome to the Dice Simulator");
			System.out.println("Tell me what size die do you want?");
			maxDieSize = reader.nextInt();
			System.out.println("How many dice would you like to roll");
			diceQuantity = reader.nextInt();
			System.out.println("Is this correct?\n"
					+ "Dice Size: " + maxDieSize
					+ "\nQuantity of Dice: " + diceQuantity);
			rollDice(diceQuantity,maxDieSize);
			System.out.println("Would you like to play again? Y/N");
			String playAgain = reader.next();
			if(playAgain.equals("N")){
				isRolling = false;
			}
		System.out.println("Thanks for playing!");
		reader.close();
		}
		
	}
	
	public static void rollDice(int diceQuantity, int diceSize){
		int i = 0;
		while(i < diceQuantity){
			double thingy = Math.random()*diceSize + 1;
			thingy = Math.round(thingy);
			Math.round(thingy);
			System.out.println("Roll " + (i+1) + ": " + thingy);
			i++;
			
			
		}
	}
}
