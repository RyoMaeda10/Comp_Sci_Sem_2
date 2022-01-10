import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = sc.nextLine();
		
		System.out.println("How old are you?");
		int age = sc.nextInt();
		
		System.out.println("What month were you born in? (1-12)");
		int month = sc.nextInt();
		
		System.out.println("What day were you born on (1-31)");
		int day = sc.nextInt();
		
		System.out.println("What year were you born?");
		int year = sc.nextInt();
		
		System.out.println("If I had a dollar and two quarters, how much money do I have?");
		double money = sc.nextDouble();
	
		String a = new String("Your name is ");
		String b = new String("You are ");
		String c = new String(" years old ");
		String d = new String("you were born on ");
		String e = new String("You have $");
		String f = new String(" in your wallet ");
		
		
		System.out.println(a+name);
		System.out.println(d+month+day+year);
		System.out.println(b+age+c);
		System.out.println(e+money+f);
		
		
		
	}
}
