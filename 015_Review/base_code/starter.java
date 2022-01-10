import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc =  new Scanner(System.in);
		
		System.out.println("What is your name?");
		String a = sc.nextLine();
		
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String b = sc.nextLine();
		
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue? "); 
		String c = sc.nextLine();
		if (a.equals("Wizard")){
			System.out.println("You are a wizard!");
		}
		else if (c.equals("Warrior")){
			System.out.println("You are a warrior!");
		}
		if (c.equals("Rouge")){
			System.out.println("You are a Rouge!");
		}
			if (a.equals("wizard")){
			System.out.println("You are a wizard!");
		}
		else if (c.equals("warrior")){
			System.out.println("You are a warrior!");
		}
		if (c.equals("rouge")){
			System.out.println("You are a Rouge!");
		}
		
		System.out.println(" ");
		
		System.out.println("You have 25 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		System.out.println(" ");
		
		System.out.println("Strength (1-10): ");
		int strength = sc.nextInt();
		int points;
		points = 25;
		
		
		if(strength > 10){
			System.out.println("Please choose a number less than 10");
			System.out.println(" ");
			System.out.println("Strength (1-10): ");
			strength = sc.nextInt();
			System.out.println("You have " + (points-strength) + " points left to spend" );
			System.out.println(" ");
		}
			
		else if(strength <= 10){
			System.out.println("You have " + (points-strength) + " points left to spend" );
			System.out.println(" ");
		}
		
		
		System.out.println("Dexterity (1-10): ");
		int dex = sc.nextInt();
		
		if(dex > 10){
			System.out.println("Please choose a number less than or equal to 10");
			System.out.println(" ");
			System.out.println("Dexterity (1-10): ");
			dex = sc.nextInt();
			System.out.println("You have " + (points-strength-dex) + " points left to spend" );
			System.out.println(" ");
		}
		
		else if(dex <= 10){
			System.out.println("You have " + (points-strength-dex) + " points left to spend" );
			System.out.println(" ");
		}

			
		System.out.println("Intelligence (1-10): ");
		int intel = sc.nextInt();
		
		if(intel > 10){
			System.out.println("Please choose a number less than or equal to 10");
			System.out.println(" ");
			System.out.println("Intelligence (1-10): ");
			intel = sc.nextInt();
			System.out.println("You have " + (points-strength-dex-intel) + " points left to spend" );
			System.out.println(" ");
		}	
			
		else if(intel <= 10){
			System.out.println("You have " + (points-strength-dex-intel) + " points left to spend" );
			System.out.println(" ");
		}
		
		if(points-strength-dex-intel<0){
			System.out.println("Please choose a number less than or equal to " + (points-strength-dex) );
			System.out.println(" ");
			System.out.println("Intelligence (1-10): ");
			intel = sc.nextInt();
			System.out.println("You have " + (points-strength-dex-intel) + " points left to spend" );
			System.out.println(" ");
			
		}
		
		
		System.out.println("Constitution (1-10): ");
		int consti = sc.nextInt();
		
		if(consti > 10){
			System.out.println("Please choose a number less than or equal to 10");
			System.out.println(" ");
			System.out.println("Constitution (1-10): ");
			consti = sc.nextInt();
			System.out.println("You have " + (points-strength-dex-intel-consti) + " points left to spend" );
			System.out.println(" ");
		}
			
		else if(consti <= 10){
			System.out.println("You have " + (points-strength-dex-intel-consti) + " points left to spend" );
			System.out.println(" ");
		}
		
		if(points-strength-dex-intel-consti<0){
			System.out.println("Please choose a number less than or equal to " + (points-strength-dex-intel) );
			System.out.println(" ");
			System.out.println("consti (1-10): ");
			consti = sc.nextInt();
			System.out.println("You have " + (points-strength-dex-intel-consti) + " points left to spend" );
			System.out.println(" ");
		}
			
		
			System.out.println("Charisma (1-10): ");
		int charisma = sc.nextInt();
		
		if(charisma > 10){
			System.out.println("Please choose a number less than or equal to 10");
			System.out.println(" ");
			System.out.println("charisma (1-10): ");
			charisma = sc.nextInt();
			System.out.println("You have " + (points-strength-dex-intel-consti-charisma) + " points left to spend" );
			System.out.println(" ");

		}	
			else if(dex <= 10){
				System.out.println("You have " + (points-strength-dex-intel-consti-charisma) + " points left to spend" );
				System.out.println(" ");
		}
		
		if(points-strength-dex-intel-consti-charisma<0){
			System.out.println("Please choose a number less than or equal to " + (points-strength-dex-intel-consti) );
			System.out.println(" ");
			System.out.println("Charisma (1-10): ");
			charisma = sc.nextInt();
			System.out.println(" ");
		}
			
	
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("-------------------------------------------------------");
		
		System.out.println("You are " + a + " the " + b +" of CVHS." );
		System.out.println("You are a " + c + " with the following stats!");
		System.out.println("Strength - " + strength);
		System.out.println("Dexterity - " + dex);
		System.out.println("Intelligence - " + intel);
		System.out.println("Constitution - " + consti);
		System.out.println("Charisma - " + charisma);
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Good luck on your quest " + a + "!");
		

			}
	}
	

		
		
	

