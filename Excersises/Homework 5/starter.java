import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("1. Each player starts with $100");
		System.out.println("2. Input a wager less than your total amount of money");
		System.out.println("3. The slot machine will role 3 numbers from 1 to 10.");
		System.out.println("	a. If two numbers match, you double your money. \n	b. If three numbers match, you triple your money. \n	c. If none match, you lose your money.");
		int money = 100;
			
				System.out.println("would you like to play slots?");
				String yes = sc.nextLine();
				
				if(!yes.equals("yes") || (!yes.equals("no"))){
					System.out.println("Please type 'yes' if you want to play, or 'no' if you dont want to play anymore");
					}
				if(yes.equals("no")){
					System.out.println("Maybe next time!");
					}
				
				
				while(yes.equals("yes")){
					int rand_num1 =  rand.nextInt(11);
					int rand_num2 =  rand.nextInt(11);
					int rand_num3 =  rand.nextInt(11);
					System.out.println(("You have $") + money + (". How much would you like to wager?"));
					int wager = sc.nextInt();
					System.out.println("\nGreat!! let's play!");
					System.out.println("Your rolls are:");
					System.out.println("________________");
					System.out.println(" | " + rand_num1 + " | " + rand_num2 + " | " + rand_num3 + " | ");
					System.out.println("________________");
		
				if((rand_num1 == rand_num2) || (rand_num1 == rand_num3) || (rand_num2 == rand_num3)){
					money = money + wager;
					System.out.println(("You won! You now have $") + money);
					}
				if(rand_num1 != rand_num2 && rand_num1 != rand_num3 && rand_num2 != rand_num3){
					money = money - wager;
					System.out.println("You lost :("); 
					}
				if(money == 0){
					System.out.println("No more money");
					break;
					}


			}
			
		
						
					}
					
					
			}
			
			
	
				
			
		
			
		
	

