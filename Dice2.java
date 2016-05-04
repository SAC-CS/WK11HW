
import java.util.Scanner;

public class Dice2 {
	private static Scanner input;
	
	public static void main(String[] args) {
		input = new Scanner( System.in );
		boolean running = true;
		Dice1 newDice = new Dice1();
		
		while(running){
			System.out.print("Please enter how many dice: ");
			int numberOfDices = input.nextInt();
			int diceRoll = newDice.throwDice(numberOfDices);
			System.out.print("Please guess the total points: ");
			int numberOfPoints = input.nextInt();
			
			if(numberOfPoints == diceRoll)
				System.out.println("You are correct!");
			else
				System.out.printf("You are wrong! \nThe number was %d.", diceRoll);
			System.out.print("Thank you for Playing!!!");
			System.out.print("\n\nWould you like to play again?, if so, press 1 ");
			int again = input.nextInt();
			
			if(again != 1) {
				newDice.printNumberOfThrows();
				newDice.printHistory();
				break;
			}
			else continue;
		}
	}
}