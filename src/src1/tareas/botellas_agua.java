package src1.tareas;


import libs.Input;

public class botellas_agua {
	
	public static void main(String arg[]) {
		System.out.println("Nombre : ");
		String j = Input.get_string();
		System.out.println("Ingresa cuantos minutos : ");
	     int i = Input.get_int();
	     int n = (i * 12);
	     System.out.println(" Duraste  : "  + i + " minutos en la regadera");
	     System.out.println(" Gastaste : "  + n + " Botellas de Agua");
	     if (n > 250) {
	    	 System.out.println(" Mul mal: *Te pasas " + j + "*");
	     }else {
	    	 System.out.println(" Muy Bien: *Estrellita para " +j+ "*");
	     }
}}
