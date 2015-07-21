package busquedas;

public class busquedaLargo {

private static int pasos;
    
	public static void imprimir(int vector[], int n, int valor){
        int encontrado = 0;
        pasos = 0;
        long inicio = 0, fin = 0;
        String resultado = "";
        
        inicio = System.currentTimeMillis();
        
        encontrado = BuscarLargo(vector, n, valor);
        
        fin = System.currentTimeMillis();
        
        if(encontrado > 0){
            resultado = "Encontrado: " + encontrado + "\n";
        }else{
            resultado = "El numero no está en la lista: \n" + encontrado;
        }
        
        resultado += "Tiempo milisegundos : " + (fin - inicio) + "\n";
        resultado += "Tiempo en segundos : " + (fin - inicio) / 1000 + "\n";
        resultado += "Pasos: " + pasos + "\n";
        
        System.out.println(resultado);
    }
	
	
	public static int BuscarLargo(int vector[], int n, int valor){
        int medio = 0, inicio = 0, fin = n - 1, encontro = 0,  numero = 0;
        
        while(encontro == 0){
        
        	pasos++;
        	
        	if(fin == vector.length - 1){
        		 medio = (int) (inicio + fin) / 2;
        	}else if(inicio == 1){
        		medio = ((vector.length - 1) / 2) + inicio;
        	}else{
        		medio = inicio + fin;
        	}
        
            if(vector[medio] == valor){
                encontro = 1;
                numero = vector[medio];
            }else{
                
                if(fin > 0){
                    fin = medio - 1;
                }else{
                    inicio = medio + 1;
                }
            }
        }
        
        return numero;
    }
}
