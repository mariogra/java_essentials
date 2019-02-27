package conditionals;

import libs.Input;

public class Logical {

	public static void main(String args[])
	{    System.out.println("Enter 'Y' , 'y', 'N' or 'n' \n"); //Añadido System.out.println("Enter a number\n")
		char c = Input.get_char();//cambio int por char-asigna el valor del numero a c
	    if (c == 'Y' || c == 'y')// condicion si c es igual a Y o y
	    {
	    	System.out.print("yes\n");//Imprime 'yes'
	    }
	    else if (c == 'N' || c == 'n')//condicion si c es igual a N 0 n
	    {
	    	System.out.print("no\n");//Imprime no
	    }
	    else//de lo contrario 
	    {
	    	System.out.print("error\n");//imprime error
	    }
	
	}
}



