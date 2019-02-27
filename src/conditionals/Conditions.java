package conditionals;

import libs.Input;

public class Conditions {

	public static void main(String args[])
	
	{   System.out.println("Enter a number\n"); //Añadido System.out.println("Enter a number\n")
	       //Cambio int por long para numeros de mayores caracteres
		long i = Input.get_long();//Se le asigna el valor  del numero a la integral i
		if (i < 0)//condicion si i es menor a cero
		{
			System.out.print("negative\n");//imprime Negative
		}
		else if (i > 0)//de lo contraril si i es mayou a cero 
		{
			System.out.print("positive\n");//Imprime positivo
		}
		else//de lo contrario
		{
			System.out.print("zero\n");//Imprime cero.
		}
	}
}
