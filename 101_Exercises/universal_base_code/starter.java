import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Ascii a = new Ascii();
		a.setType("Human");
		a.setName("Jonh");
		a.setNumber(1);
		a.setAscii("");
		a.printArt();

		System.out.println(" ");
		Ascii b = new Ascii("dog");
		b.printArt();
		
		System.out.println(" ");
		Ascii c = new Ascii("cactus", "Joesef");
		c.printArt();
		
		System.out.println(" ");
		Ascii d = new Ascii("other", "jon", 1);
		d.setAscii(":D");
		d.printArt();
		
		System.out.println(" ");
		Ascii e = new Ascii("new", "larry");
		e.printArt();
	}
}
