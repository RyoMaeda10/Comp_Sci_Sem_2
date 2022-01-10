import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number");
		int x = sc.nextInt();
		int count =1;
		int y = x;
		
		while(true){
			y = y * count;
			
			
			if(count == (x - 1)){
				System.out.println(y);
				break;
			}
			count = count +1;
		}
	
	
	}
	

}
	
	

