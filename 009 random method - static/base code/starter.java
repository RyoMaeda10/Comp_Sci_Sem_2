import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		int rand_num1 =  rand.nextInt(10);
		System.out.println("A random number between 1-9 is: " + rand_num1);
		
		int rand_num2 = rand.nextInt(100);
		int b = 1;
		System.out.println("A random number between 1-100 is: " + (rand_num2 + b));
		
		double rand_num3 = rand.nextDouble();
		double a;
		a = 2.5;
		System.out.println("A random number between 2.5 and 3.5 is: " + (a+rand_num3));
		
		
		int rand_num5 =  rand.nextInt(576);
		int f;
		f = 14;
		double rand_num4 = rand.nextDouble();
		System.out.println("A random double between 14 and 589 is: " + (f + rand_num4 + rand_num5 ));
		
		
		
		
	}
}
