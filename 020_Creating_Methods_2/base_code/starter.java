import java.util.Scanner;
import java.util.Random;

class starter {
	
	
	public static void add(double a,double b){
		
		System.out.println(("the answer of your first number to the power of your second is: ") + Math.pow(a,b));
		
	}
	
	
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number");
		double a = sc.nextInt();
		System.out.println("Another one");
		double b = sc.nextInt();
		add(a,b);


		
	}
}
