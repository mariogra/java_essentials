package methods;

import libs.Input;

public class Cough0 {

	public static void main(String args[])
	{   
		System.out.println("Enter a number\n");//Añadido System.out.println("Enter a number\n")
		int i = Input.get_int();		       //añadi imput data.
		while (i > 0) {
		if(i == 1){
		System.out.print(" You are OK ");
	}
		else
	{ System.out.print(i + " cough\n");
	}
		i -=1;
	}
}}
