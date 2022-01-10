package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter{

	public String type;
	public int str;
	public int dex;
	public int intel;
	public int cons;
	public int charis;
	
	public static void myToString(){
		System.out.println("You are a warrior!");
		System.out.println("Strength: 5\n Dexterity: 5\n Intelligence: 5\n Constitution: 5\n Charisma: 5\n");
	}
	
		
		public myCharacter(){
			str = 0;
			dex = 0;
			intel = 0;
			cons = 0;
			charis = 0;
			type = "no role";
		}
		
		public myCharacter(String b){
			type = b;
		if(type.equals("Wizard")){
			System.out.println("You are a wizard!");
		}
		else if(type.equals("Warrior")){
			System.out.println("You are a warrior!");
		}
		else if(type.equals("Rogue")){
			System.out.println("You are a rogue!");
		}
		else{
			type = "no role";
			System.out.println(type);
		}	
			
		}
	}
