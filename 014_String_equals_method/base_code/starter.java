import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("Would you like to be a Wizard, Warrior, or Rogue? "); 
		String a = sc.nextLine();
		
		if (a.equals("Wizard")){
			System.out.println("You are a wizard!");
		}
		else if (a.equals("Warrior")){
			System.out.println("You are a warrior!");
		}
		if (a.equals("Rouge")){
			System.out.println("You are a Rouge!");
		}
	}
}
