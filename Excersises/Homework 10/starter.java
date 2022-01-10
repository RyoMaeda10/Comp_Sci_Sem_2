import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	    Random r = new Random();
	    int []a = new int[20];
	    int count = 0;
	    int c = 0;
	    int c1 = 0;
	    int target = r.nextInt(10) + 1;
	    
		System.out.println("___________________________________");
		System.out.println("these are the random numbers");
	    while(count < a.length){
	        a[count] = r.nextInt(10) + 1;
	        System.out.print(a[count] + " ");
	        count ++;
	    }
	    System.out.println(" ");
	    System.out.println("___________________________________");
	    System.out.println("The target number is: " + target);
	    System.out.print("Duplicate found at index(es): ");
	    
	    count = 0;
		while(count < a.length){
			if(target == a[count]){
			System.out.println(a[count] + " ");
			c++;
			}
			count++;
		}
		System.out.println("There are/is " + c + " instances of the target number");
		
		

		
	}
}

