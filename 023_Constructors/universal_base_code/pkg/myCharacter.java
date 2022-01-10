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
		else if(type.equals("Rougue")){
			System.out.println("You are a rougue!");
		}
		else{
			type = "no role";
			System.out.println(type);
		}	
			
		}
	}
