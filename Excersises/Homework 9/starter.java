import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	    Random r = new Random();
	    int[]a = new int[20];
	    int[]b = new int[20];
	    int count = 0;
        int count2 = 19;

	    while(count < a.length){
	        a[count] = r.nextInt(50);
	        System.out.println(a[count]);
	        count ++;
	    }
	    
	    System.out.println(" ");
	    
		while(count2 > -1){
		    b[count2] = r.nextInt(50);
		    System.out.println(a[count2] + 1);
		    count2--;
		}
		


		
	}
}
