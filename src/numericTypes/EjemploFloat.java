package numericTypes;

import libs.Input;

public class EjemploFloat {

	public static void main(String[] args) {
		System.out.println("Inserta un numero decimal");
		float f = Input.get_float();
		
		float f2 = Input.get_float();
		
		Input.print("f/f2 = " + (f/f2));

	}

}
