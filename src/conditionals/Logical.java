package conditionals;

import libs.Input;

public class Logical {

	public static void main(String args[])
	{    System.out.println("Enter a number\n"); //Añadido System.out.println("Enter a number\n")
		int c = Input.get_char();
	    if (c == 'Y' || c == 'y')
	    {
	    	System.out.print("yes\n");
	    }
	    else if (c == 'N' || c == 'n')
	    {
	    	System.out.print("no\n");
	    }
	    else
	    {
	    	System.out.print("error\n");
	    }
	
	}
}



