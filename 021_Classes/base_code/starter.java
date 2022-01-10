import java.util.Scanner;
import java.util.Random;


class character{
	String type = new String ("Wizard");
	int str = 5;
	int dex = 5;
	int intel = 5;
	int cons = 5;
	int charis = 5;
	}


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		character mycharacter = new character();
		System.out.println(mycharacter.type);
		System.out.println("Strength = " + mycharacter.str);
		System.out.println("dexterity = " + mycharacter.dex);
		System.out.println("Intelligence = " + mycharacter.intel);
		System.out.println("Constitution = " + mycharacter.cons);
		System.out.println("Charisma = " + mycharacter.charis);
	

		
	}
}
