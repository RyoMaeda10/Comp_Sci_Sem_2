import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc =  new Scanner(System.in);
	
		
		System.out.println("Give me any number.");
		double x = sc.nextDouble();
		
		System.out.println("Give me another number.");
		double y = sc.nextDouble();
		
		System.out.println("The max of your two numbers is " + Math.max(x,y));
		System.out.println("The Square root of your second number is " + Math.sqrt(y));
		System.out.println("Your first number to the power of your second number is " + Math.pow(x,y));
		
	
	
		
		
		
		
		
	}
}
