import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		System.out.println("The maxinum number of 13 - 6 * 11, and 30 % 7 * -2 is " + Math.max(13-6*11,30%7*-2));
		System.out.println("The Square root of 3 * 8 + 31 % 7 is " + Math.sqrt(3*8+31%7));
		System.out.println("37 / 3 to the power of 35 % 7 is " + Math.pow(37/3,35%21));
		System.out.println("The maxinum number of 2 to the power of 14 % 3 and the square root of 2 * 6 is " +Math.max(Math.pow(2,14%3),Math.sqrt(2*6)));
	}
}
