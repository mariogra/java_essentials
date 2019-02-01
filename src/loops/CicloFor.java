package loops;

import libs.Input;

public class CicloFor {

	public static void main(String[] args) {
	int numero  = 0;
		while(numero <= 10) {
			Input.print(numero);//imprimme un numero empezando en 0 y llama un metodo del programa Input
			Input.print("  ");
			numero += 1;
		}
		Input.print("\n");
		
		for(int num = 0; num <= 10 ; num += 1) {
			
			Input.print(num);//imprimme un numero empezando en 0 y llama un metodo del programa Input
			Input.print("  ");
			
		}
		
		for(int num = 10; num >= 0 ; num--) {
			
			Input.print(num);
			Input.print("  ");
			
		}

	}

}
