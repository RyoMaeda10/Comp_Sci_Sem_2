import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("What is your first class? :");
		String a = sc.nextLine();
		System.out.println("What is the grade 0.0-5.0? ");
		double g1 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("what is your second class? :");
		String b = sc.nextLine();
		System.out.println("What is the grade 0.0-5.0? ");
		double g2 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("what is your third class? :");
		String c = sc.nextLine();
		System.out.println("What is the grade 0.0-5.0? ");
		double g3 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("what is your fourth class? :");
		String d = sc.nextLine();
		System.out.println("What is the grade 0.0-5.0? ");
		double g4 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("What is your fifth class? :");
		String e = sc.nextLine();
		System.out.println("What is the grade 0.0-5.0? ");
		double g5 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("What is your sixth class? :");
		String f = sc.nextLine();
		System.out.println("What is the grade 0.0-5.0? ");
		double g6 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("What is your seventh class: ");
		String g = sc.nextLine();
		System.out.println("What is the grade 0.0-5.0? ");
		double g7 = sc.nextDouble();
		
		
		double GPA1;
		GPA1 = (g1+g2+g3+g4+g5+g6+g7);
		double GPA2;
		GPA2 = 7.0;
		
		double GPA;
		GPA = (GPA1/GPA2);
		
		
		System.out.println("Your total GPA is: " + GPA);
		
	


		
	}
}
