import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		String[]x = new String[20];
		x[0] = ("  ^^^");
		x[1] = ("   . )");
		x[2] = ("      >");
		x[3] = ("   ()");
		x[4] = ("   ()");
		x[5] = (" gobble gobble :)");

		
		int y = 0;
		while (y < 6){
			System.out.println(x[0 + y]);

			y++;
		}

		
	}
}
