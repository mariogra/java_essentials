package methods;

import libs.Input;

public class Cough1 {

	public static void main(String args[])
	{   
		System.out.println("Enter a number\n");//A�adido System.out.println("Enter a number\n")
		int i = Input.get_int();		       //a�adi imput data.
		for (int a = 0; a < i; a++)  // add a different variable
		{
			System.out.print("cough\n");
		}
		System.out.println("you are ok"); // a�adido
	}
}
