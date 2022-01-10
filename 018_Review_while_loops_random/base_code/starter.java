import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
			
	Scanner sc = new Scanner (System.in);
	Random rand = new Random();
	
	
		int secret_numb = rand.nextInt(1000);
		
		
		while(true){
			
			
			System.out.print("Guess a number: ");
			int guess = sc.nextInt();
			
			
			if (guess==secret_numb){
			System.out.println("You got it!");
				break;
			}
			
	
			else if (guess<secret_numb){
				System.out.println("little too low ");
				System.out.println(" ");

			}	
			
			
			else if (guess>secret_numb){
				System.out.println("little too high");
				System.out.println(" ");
			}
				
				}
			
			
			
		}
	
	


		
	}


