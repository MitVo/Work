package busquedas;

public class mainBusqueda {
	
	public static void main(String[] args) {
		
		int vector[] = {7,3,10,5,8,9,2};
	        
	    busquedaCorto.imprimir(vector, vector.length, 7);
	    busquedaLargo.imprimir(vector, vector.length, 7);
	    busquedaRecursivo.imprimir(vector, vector.length, 7);
	            
	    }
}
