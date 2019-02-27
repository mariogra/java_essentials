package conditionals;

import libs.Input;//llama un metodo de libs input.

public class Switch {

public static void main(String args[])
{    System.out.println("Enter 'Y', 'y', 'N' or 'n' \n"); //Añadido System.out.println("Enter a number\n")
	char c = Input.get_char();// toma el valor ingresado, se le asigna a c.
	switch (c)
	{
	case 'Y':
	case 'y':
		System.out.print("yes\n");
		break;
	case 'N':
	case 'n':
		System.out.print("no\n");
		break;
	default:
		System.out.print("error\n");
		break;
	}
}
}




