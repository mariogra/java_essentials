package src1.tareas;

import libs.Input;

public class Mario_dificil {
	public static void main(String args[]) {
	
	
	System.out.println("Ingresa Altura");
	int n = Input.get_int();
   
    //renglon
    for(int x = 0 ;x < n ; x++) {
    	int esp1 = n  - x; 
	    int gat1 = n + 1 - esp1;
        int esp2 = 1;
        int gat2 = n  - esp1;
        int esp3 = n  -x;
        
			// esp1
			for( int a = 0 ; a < esp1 ; a++) {	
    		System.out.print(" ");
			}
			//gat1
			for( int b = 0 ; b < gat1  ; b++) {
				System.out.print("#");
			}
			//esp2
			for( int c = 0 ; c < esp2  ; c++) {
				System.out.print(" ");
			}
			//gat2
			for( int d = 0 ; d <= gat2  ; d++) {
				System.out.print("#");
			}
			//esp3
			for( int e = 0 ; e < esp3 ; e++) {
				System.out.print(" ");
	      }System.out.println();
	}}}


