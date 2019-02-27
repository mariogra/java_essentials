package loops;

import libs.Input;

public class CicloFor {

	public static void main(String[] args) {
	//int numero  = 0; se decalro en linea 10
	System.out.println("Enter a number  \n ");//se añadio imprimir linea
	   int numero= Input.get_int();// se añadio asignacion
	   
		while(numero <= 10) {
			Input.print(numero);//imprimme un numero empezando en 0 y llama un metodo del programa Input
			Input.print("  ");
			numero += 1;
		}
		Input.print("\n");
		
		for(int num = 0; num <= numero; num ++) {//se cambio la condicion de hasta llegar al numero ingresado
			
			Input.print(num);//imprimme un numero empezando en 0 y llama un metodo del programa Input
			Input.print("  ");
			
		}
		Input.print("\n");//se añadio imprimir linea abajo
		for(int num = numero; num >= 0 ; num--) {//se cambio la condicion de hasta llegar al numero ingresado
			
			Input.print(num);
			Input.print("  ");
			
		}

	}

}
