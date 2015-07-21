package busquedas;

public class busquedaRecursivo {

private static int pasos;
    
public static void imprimir(int vector[], int n, int valor){
        int encontrado = 0;
        pasos = 0;
        long inicio = 0, fin = 0;
        String resultado = "";
        
        inicio = System.currentTimeMillis();
        
       encontrado = buscarRecursivo(vector, 0, n - 1, valor);
        
        fin = System.currentTimeMillis();
        
        if(encontrado > 0){
            resultado = "Encontrado: " + encontrado + "\n";
        }else{
            resultado = "El numero no esté en la lista: \n";
        }
        
        resultado += "Tiempo milisegundos : " + (fin - inicio) + "\n";
        resultado += "Tiempo en segundos : " + (fin - inicio) / 1000 + "\n";
        resultado += "Pasos: " + pasos + "\n";
        
        System.out.println(resultado);
    }
    
    
    public static int buscarRecursivo(int vector[],int inicio, int fin, int valor){
        int medio = 0; 
        
        if(fin == vector.length - 1){
            medio = (int) (inicio + fin) / 2;
        }else if(inicio == 1){
                medio = ((vector.length - 1) / 2) + inicio;
        }else{
            medio = inicio + fin;
        }
        
        if(medio > vector.length - 1){
            return 0;
        }else{
            if(vector[medio] == valor){
            	 pasos++;
                return vector[medio];
            }else{
                if(fin > 0){
                    pasos++;
                    return(buscarRecursivo(vector, inicio, medio - 1, valor));
                }else{
                    pasos++;
                    return(buscarRecursivo(vector, medio + 1, fin, valor));
                }
            }
        }   
    }
	
}
