import java.util.Scanner;
import java.util.Random;

class starter {
	public static void toString(String a){
		System.out.println(a);
	}
	
	public static void toStringCombined(String b, String c){
		
		System.out.println(b + " " + c);
	
	
	}
	public static void main(String args[]) {
		// Your code goes below here
		//toString("hi im ryo");
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in a sentence");
		String b = sc.nextLine();
		System.out.println("Another one");
		String c = sc.nextLine();
		toStringCombined(b,c);
		
	

		
	}
}
