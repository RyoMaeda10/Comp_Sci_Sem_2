import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type a name: ");
		String name = sc.nextLine();
		
		System.out.println("How many times do you want it to be displayed: ");
		int num = sc.nextInt();
		
		
		int a;
		a = 0;
		while(true){
			System.out.println(name);
			if(a==num){
				break;
			}
			a++;
		}
		



		
	}
}
