import java.util.Scanner;
import java.util.Random;

class starter {
	public static String stinky(int a, int b){
		int x = a;
		int y =b;
		int ans = ((x * y)%3);
			if (ans == 0){
				return("very cool");
			}
			else{
				return("yikes");
			}
		}
		
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		System.out.println("another one");
		int b = sc.nextInt();
		System.out.println(stinky(a,b));
		}
		
						
					}
					
					
	
			
			
	
				
			
		
			
		
	

