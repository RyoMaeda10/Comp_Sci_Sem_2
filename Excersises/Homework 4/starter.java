import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Input a number");
		int num = sc.nextInt();
		System.out.println("input another number");
		int num2 = sc.nextInt();
		
		if(num % 2 == 0){
			System.out.println("Your first number is even");
		}
		else{
			System.out.println("Your first number is odd");
		}
	    
	    if(num2 % 2 == 0){
			System.out.println("Your second number is even");
		}
		else{
			System.out.println("Your second number is odd");
		}
		if(num % 3 == 0){
			System.out.println("Your first number is divisible by 3");
		}
		else{
			System.out.println("Your first number is not divisible by 3");
		}
		if(num2 % 3 == 0){
			System.out.println("Your second number is divisible by 3");
		}
		else{
			System.out.println("Your second number is not divisible by 3");
		}
		if(num % 4 == 0){
			System.out.println("Your first number is divisible by 4");
		}
		else{
			System.out.println("Your first number is not divisible by 4");
		}
			if(num2 % 4 == 0){
			System.out.println("Your second number is divisible by 4");
		}
		else{
			System.out.println("Your second number is not divisible by 4");
		}
		if(num % 5 == 0){
			System.out.println("Your first number is divisible by 5");
		}
		else{
			System.out.println("Your first number is not divisible by 5");
		}
		if(num2 % 5 == 0){
			System.out.println("Your second number is divisible by 5");
		}
		else{
			System.out.println("Your second number is not divisible by 5");
		}
		
		


		
	}
}
