package methods;

import libs.Input;

public class Cough2 {

	public static void main(String args[])
	{ System.out.println("Enter a number\n");//A�adido System.out.println("Enter a number\n")
	int i = Input.get_int();		       //a�adi imput data.
		for (int a = 0; a < i; i++)
		{
			cough();
		}
		cool();
	}
	public static void cough()
	{
		System.out.print("cough\n");}
	
	public static void cool()   //metodo aded
	{
		System.out.print("you are ok"); //print added
	
}}
