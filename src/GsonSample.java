import java.util.*;

public class GsonSample {
	
	public static void main (String [ ] args) {
		
		String nombre, apellidos, edad;
		boolean resultado;
		
        Scanner entradaEscaner = new Scanner (System.in);
        
		System.out.print("Introduce tu nombre:");
		nombre = entradaEscaner.nextLine();
		
		System.out.print("Introduce tus apellidos:");
		apellidos = entradaEscaner.nextLine();
		
		
		do {
			
			System.out.print("Introduce tu edad:");
			
	        try {
	        	
				edad = entradaEscaner.nextLine();
	            Integer.parseInt(edad);
	            resultado = true;
	            
	        } catch (NumberFormatException excepcion) {
	        	
	        	System.out.println("Error: Introduce una edad correcta");
	            resultado = false;
	            
	        }
			
		} while(!resultado);
		
	}
	
}