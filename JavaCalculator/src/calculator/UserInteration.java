package calculator;

import java.util.Scanner;

public class UserInteration {
	static float finalAnswer = 0.0f;
	
	private static void calculator(){
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter your calculation with section seperated by a space.\n" +
                  "When ready to calculate please press enter. Example: 2 + 2 * 10 - 6\n" + 
                  "Your previous answer will be stored. if you wish to start again at 0 please enter clear\n" + 
                  "If you wish to start with the previous answer simply enter ans instead of an integer\n" +
                  "When you wish to exit please enter q.");
		String newInput = userInput.nextLine().replace("\n", "");
		newInput = newInput.replace("#", "");
		while(!newInput.equals("q")) {
			String[] userCalculation = newInput.split(" ");
			finalAnswer = Calculate.calculate(userCalculation);
			System.out.println(finalAnswer);
			newInput = userInput.nextLine();
		}
		userInput.close();
		
	}
	
	public static void main(String[] args) {
		calculator();
	}

}
