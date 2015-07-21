package busquedas;

public class busquedaCorto {

private static int pasos;
    
    public static int buscarCorto(int vector[ ], int n, int valor){
       int i, encontro = 0, numero = 0;
        for(i = 0; i < n; i++){
            if(vector[i] == valor && encontro == 0){
                encontro = 1;
                numero = vector[i];
            }
            pasos++;
        }
        
        return numero;
    }
    
    public static void imprimir(int vector[], int n, int valor){
        int encontrado = 0;
        pasos = 0;
        long inicio = 0, fin = 0;
        String resultado = "";
        
        inicio = System.currentTimeMillis();
        
        encontrado = buscarCorto(vector, n, valor);
        
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
	
}