import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		
		myCharacter a = new myCharacter();
			a.myToString(); 
		
		System.out.println("What role would you like to be?");
		String choice = sc.nextLine();

		a.myGuy(choice);
			
		System.out.println("You have 25 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		System.out.println(" ");
		int Strength = sc.nextInt();
		System.out.println("Strength (1-10): ");
		int Dexterity = sc.nextInt();
		System.out.println("Dexterity (1-10): ");
		int Intel = sc.nextInt();
		System.out.println("Intelligence (1-10) ");
		int Constitution = sc.nextInt();
		System.out.println = ("Constitution (1-10) ");
		int Charisma = sc.nextInt();	
		System.out.println("Charisma(1-10) ");
		
		a.Stats(Strength, Dexterity, Intel, Constitution, Charisma);
		
	}
}
