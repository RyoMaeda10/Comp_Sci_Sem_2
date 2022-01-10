package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter{
	
	public Scanner sc = new Scanner(System.in);
	public String type;
	public int str;
	public int dex;
	public int intel;
	public int cons;
	public int charis;
	
	
	
	public static void myToString(){
		System.out.println("Your role is No Role");
		System.out.println("Strength: 0\nDexterity: 0\nIntelligence: 0\nConstitution: 0\nCharisma: 0\n");
		System.out.println("____________________________________");
	}
	
	public void myGuy(String b){
			type = b;
		if(type.equals("Wizard")){
			System.out.println("You are a wizard!");
			System.out.println("Strength: 0\nDexterity: 0\nIntelligence: 0\nConstitution: 0\nCharisma: 0\n");
		}
		else if(type.equals("Warrior")){
			System.out.println("You are a warrior!");
			System.out.println("Strength: 0\nDexterity: 0\nIntelligence: 0\nConstitution: 0\nCharisma: 0\n");
		}
		else if(type.equals("Rogue")){
			System.out.println("You are a rogue!");
			System.out.println("Strength: 0\nDexterity: 0\nIntelligence: 0\nConstitution: 0\nCharisma: 0\n");	
		}
		else{
			type = "no role";
			System.out.println(type);
		}
	}
		
		public void Stats(int str1, int dex1, int intel1, int cons1, int charis1){
			int str = str1;
			int dex = dex1;
			int intel = intel1;
			int cons = cons1;
			int charis = charis1;
			System.out.println("Your Strength stat is: " + str);
			System.out.println("Your Dexterity stat is: " + dex);
			System.out.println("Your Intelligence stat is: " + intel);
			System.out.println("Your Constitution stat is: " + cons);
			System.out.println("Your Charisma stat is: " + charis);
			
		}	
		
		
	}
	
		
		
			
		
	
