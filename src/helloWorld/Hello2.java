package helloWorld;

import libs.Input;

public class Hello2 {

	public static void main(String args[])
	{    System.out.println("Enter name: \n");//Imprimir el nombre a ingresar
		String name = Input.get_string();//llama al metodo del Input program
		System.out.println("hello, "+ name + "\n");   
	}
}