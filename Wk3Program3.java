package wk3;

import java.util.Scanner;
// Claire Francis, September 18, 2025, Wk3Program3


// Consider the following code.  Determine what the code is supposed to do, and then fix the code so that it works without error. 


public class Wk3Program3 {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		boolean e;
		String s;
		int o;
		
        System.out.print("How old are you?");

        s = userinput.nextLine();
        int n = Integer.parseInt(s);

        o = (n + 5);
        
        
        System.out.println("In 5 years you will be " + o + " years old.");
        
        e = (12 < n) && (n < 20);
        
        if(e == true); 
        
        System.out.println("It is " + e + " that you are a teenager");

        System.out.println("I am such a smart computer.");
		
		
		
		
		
		
		
		
		
		
	}

}
