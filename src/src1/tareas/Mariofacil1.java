package src1.tareas;
import java.util.*;
import libs.Input;

public class Mariofacil1 {
	public static void main(String args[]) {
		
		System.out.println("Ingresa Altura");
		int n = Input.get_int();
	   
	    //renglon
	    for(int x = 0 ;x < n ; x++) {
	    	int espacios = n -1 - x; 
		    int gatos = n + 1 - espacios;
	           	// espacios 
				for( int k = 0 ; k < espacios ; k++) {	
	    		System.out.print(" ");
				}
				//gatos
				for( int m = 0 ; m < gatos  ; m++) {
				System.out.print("#");
				}
		       System.out.println();
		}}}
		
