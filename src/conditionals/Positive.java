package conditionals;

import libs.Input;

public class Positive {

	public static void main(String args[])
	{    
		System.out.println("Enter a number\n"); //Añadido System.out.println("Enter a number\n")
		int i = get_positive_int();//ingresar un numero.
		System.out.print(i + " is a positive integer\n");
	}

	public static int get_positive_int()//DUDA  como trabaja esta linea.?
	{
	    int n;
	    do
	    {
	    	System.out.print("n is ");
	        n = Input.get_int();
	    }
	    while (n < 1);
	    return n;//si el valor es menor de 1 se retorna n
	}
}


