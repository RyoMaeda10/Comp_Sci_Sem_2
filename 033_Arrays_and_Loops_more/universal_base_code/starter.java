import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random r = new Random();
		int x = r.nextInt(150);
		int a[] = new int[x + 50];
		int count = 0;
		int min = 100;
		int max = 0;
		int ave = 0;
		while(count < a.length){
			a[count] = r.nextInt(99);
			if(min > a[x]){
				min = a[x];
			}
			if(max < a[x]){
				max = a[x];
			}
			ave = ave + a[x];
			count++;
			}
			System.out.println("There are " + (x + 50) + " elements");
			System.out.println("The maximum number is: "  + max);
			System.out.println("The mininum number is: " + min);
			System.out.println("The average number is: " + (ave/a.length));
		}


		
	}

