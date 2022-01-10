import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
			
			
			
			
		System.out.println("no role");
		System.out.println("Strength = " + "0");
		System.out.println("dexterity = " + "0");
		System.out.println("Intelligence = " + "0");
		System.out.println("Constitution = " + "0");
		System.out.println("Charisma = " + "0");	
			
		System.out.println("Do you want to be a Wizard, Warrior, or Rougue");
		String b = sc.nextLine();
		
		myCharacter joe = new myCharacter();
	
		
		myCharacter john = new myCharacter(b);
		

		}	
				

		
	}
