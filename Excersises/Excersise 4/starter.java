import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an int");
		int a = sc.nextInt();
		
		while(a<1000){
			a = a + 1;
			System.out.println(a);
		
		if(a==1000){
				break;
			}
}
		
	}
}
