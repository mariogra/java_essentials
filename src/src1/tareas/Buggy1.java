package src1.tareas;

import libs.Input;

public class Buggy1 {

	public static void main(String[] args) {
	
		long a= get_negative_long();
		Input.print(a + " is a negative integer\n");   	    }
            	public static long get_negative_long()
	{
		long n;
	   do
    {
	    	Input.print("n is ");
	        n = Input.get_long();
	 }
	    while (n >= 0) ;
	    return n;  
}}
	

