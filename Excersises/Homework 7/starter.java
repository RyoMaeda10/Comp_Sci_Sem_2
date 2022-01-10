import java.util.Scanner;
import java.util.Random;


class myDog{
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    String name;
    int age;
    String breed;
    int fifty;
    
    public myDog(){
    	name = ("Clifford");
    	age = 3;
    	breed = ("big red dog");
    	fifty = r.nextInt(2);
    }
    public myDog(String a){
    	name = a;
    	age = 1;
    	breed = ("dog dog");
    	fifty = r.nextInt(2);
    }
    public myDog(String b, String c){
        breed = b;
        name = c;
        age = 1;
        fifty = r.nextInt(2);
    }
    public myDog(String d, int e){
        age = e;
        name = d;
        breed = ("dog dog");
        fifty = r.nextInt(2);
    }
    
    public void setName(String newName){
        name = newName;
        return;
    }    
    public void setAge(int newAge){
        age = newAge;
        return;
    }
    public void setBreed(String newBreed){
        breed = newBreed;
        return;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getBreed(){
        return breed;
    }
    public boolean isSleeping(){
            if(fifty == 1){
                return true;
            }
            else{
                return false;
            }
    }
    public void bark(){
        System.out.println(name + (" barked!"));
        return;
    }
     
          
  }
  
  

class starter {
	public static void main(String args[]) {
	
	myDog a = new myDog("John", 12);
    myDog b  = new myDog("Aussie", "Harry");
    
	    if(a.isSleeping()){
	        System.out.println(a.getName() + " is sleeping");
	    }
	    else{
	        System.out.println(a.getName() + " Barked!!");
	    }
	    
	    if((b.isSleeping()) && (a.isSleeping())){
	        System.out.println(b.getName() + (" is sleeping"));
	    }
	    else if((b.isSleeping()) && (!a.isSleeping())){
	        System.out.println(b.getName() + (" barked!!"));
	    }
	    else if(!a.isSleeping()){
	        System.out.println(b.getName() + (" barked!!"));
	    }
	}
	}	
	