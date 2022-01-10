import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Input a number between 1 and 1000: ");
		int a = sc.nextInt();
		
		Random rand = new Random();
		int b =  rand.nextInt(1001);
		
		if(a==b){
			System.out.println("You guessed the number!");
		}
		else if(a>b) {
			System.out.println("Your number is larger than the random");
		}
		else if(a<b) {
			System.out.println("Your number is smaller than the random");
		}
		else{
			System.out.println("Try again!");
		}
	}
}
