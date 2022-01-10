import java.util.Scanner;
import java.util.Random;

class starter {
    
	public static boolean checkPrime(int a){
		int count = 2;
		while(count < a){
			if(a % count == 0){
				return false;
			}
			count = count + 1;
		}
		return true;
	}
		
	
	public static void printPrimes(int a){      
	    int count = 2;
		while(count < a) {
			if(checkPrime(count) == true){
				System.out.println(count);
			}
			count = count + 1;
		}
		
	}
	       
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number and we'll print out every prime until that number: ");
		printPrimes(sc.nextInt());

		
		}
		
						
					}
