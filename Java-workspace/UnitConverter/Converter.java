package Main;

import java.util.Scanner;

public class Converter {
	public static void main (String[]arg) {
		
		int menuSelection = 0; 
		double firstNumber = 0.0;
		while (menuSelection != 4) {
			
			System.out.println("Please type in a number to select an option:");
			Scanner input = new Scanner(System.in);
			
			System.out.println("1. Days to Hours" ); //Selection 1
			System.out.println("2. Hours to Minutes"); //Selection 2
			System.out.println("3. Minutes to Seconds");//Selection 3
			System.out.println("4. Quit");//Selection 4
			
			menuSelection = input.nextInt(); //scanning user input
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Please input the value you want to convert.");
			firstNumber = scan.nextDouble();
			
			
			switch(menuSelection) {
			case 1:
				System.out.println(firstNumber * 24 + "Hours");	
				break;
			case 2:
				System.out.println(firstNumber * 60 + "Minutes");
				break;
			case 3:
				System.out.println(firstNumber * 60 + "Seconds");
				break;
			case 4: 
				System.out.println("You have quit this unit converter application.");
				break;
			default:
				System.out.println("Please enter a valid number from the menu.");
				break;
				
				
				
			}
			
			
		}
		
		
	}
	     
}
