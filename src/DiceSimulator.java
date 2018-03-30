import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

public class DiceSimulator {
	static boolean isRolling = true;
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		
		Dice dice = new Dice();
		while(isRolling){
			int typesOfDice = typesOfDice(reader);
			for(int i = 1; typesOfDice > i; i++) {
				rollingInformation(reader,i);
			}
			
			//rollDice(diceQuantity,maxDieSize);
			playAgain(reader);
		System.out.println("Thanks for playing!");
		reader.close();
		}
		
	}
	
	/*
	 * Asks the user how many different types of Dice they would like to roll
	 * Returns the Number of unique dice they would like to roll
	 */
	public static int typesOfDice(Scanner reader) {
		System.out.println("How many different types of Dice do you want?");
		int typesOfDice = reader.nextInt();
		return typesOfDice;
	}
	public static void rollingInformation(Scanner reader, int diceNumber){
		System.out.println("Hello and Welcome to the Dice Simulator");
		System.out.println("Tell me what size die do you want for Dice #" + diceNumber );
		int maxDieSize = reader.nextInt();
		System.out.println("How many dice would you like to roll");
		int diceQuantity = reader.nextInt();
		System.out.println("Is this correct?\n"
				+ "Dice Size: " + maxDieSize
				+ "\nQuantity of Dice: " + diceQuantity);
		rollDice(maxDieSize,diceQuantity);
		//Dice dice = new Dice(maxDieSize,diceQuantity);
	}
	
	public static int getMaxDieSize(int maxDieSize){
		return maxDieSize;
	}
	
	public static int getDiceQuantity(int diceQuantity){
		return diceQuantity;
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
	
	public static void playAgain(Scanner reader){
		System.out.println("Would you like to play again? Y/N");
		String playAgain = reader.next();
		if(playAgain.equals("N")){
			isRolling = false;
		}
	}
}