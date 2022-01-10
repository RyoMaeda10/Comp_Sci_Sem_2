import java.util.Scanner;
import java.util.Random;


class myCat{
    String name;
    
    public myCat(){
        name = new String("garfield");
    }
    
    public myCat(String a){
        name = a;
    }
    public void catMeow(){
            System.out.println(name + (" is meowing")); 
            return;
        }
     
          
  }
  
  

class starter {
	public static void main(String args[]) {
	   myCat a = new myCat();
	   a.catMeow();
	  
	   myCat b = new myCat("Dequavis");
	   b.catMeow();
	}	
}	