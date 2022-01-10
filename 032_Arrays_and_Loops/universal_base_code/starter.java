import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random r = new Random();
		int count = 0;
		int[]a = new int[999];
		while(count < a.length){
			a[count] = r.nextInt();
			count++;
		}
		count = 0;
		while(count < a.length){
			System.out.println(a[count]);
			count++;
		}
		
		


		
	}
}
