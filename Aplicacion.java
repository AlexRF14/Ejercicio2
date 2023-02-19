package operativa;
import principal.Principal;
import java.lang.Math;
import java.util.ArrayList;
public class Aplicacion {
    public static int sumatorio(int n_in){
       // n_in = Principal.n;
        if(n_in == 1){
            return 1;
        }else{
            return (n_in + sumatorio(n_in - 1));
        }
    }
    public static int factorial(int f_in){
        if(f_in == 1){
            return 1;
        }else{
            return (f_in * factorial(f_in - 1));
        }
    }
    public static int potencia_enesima(int m , int p){
        
        if(p == 0){
            return 1;
        }else{if(m == 1 || p <= 0){
            return m;
        }else{
            return (m * potencia_enesima(m, p-1));
        }
    }
    }
    
    
    
    public static double sumaDeArray(double lista[] , int a){ 

        
        double SolucionS;
        
        if(a == 0){ 
        
        return lista[a]; 
        
        }else{ 
        
        SolucionS = lista[a] + sumaDeArray(lista , a - 1);
        
        } 
        return SolucionS;
                
    }
    public static double desviacionDeArray(double lista[] , int b){

        
        
        if(b==0){
            return lista[b];

        }else{
            return (Math.pow(lista[b] - (sumaDeArray(lista, lista.length - 1) / lista.length)  , 2) + desviacionDeArray(lista , b - 1));
        }
    }
    public static double sumaDePares(int x){

        if(x == 0){
            return x;
        }else{if(x % 2 == 0){
            return x + sumaDePares(x - 1);
        }else
            return sumaDePares(x - 1);

        }
    }
    
    public static double sumaDeParesLista(double lista[] , int x){

        if(x == 0){
            return lista[x];
        }else{if(x % 2 == 0){
            return lista[x] + sumaDeParesLista(lista, x - 1);
        }else
            return sumaDeParesLista(lista, x - 1);

        }
    }
    
  
    


    public static ArrayList nuevaListaArray(double lista[] , int x){
        ArrayList<Double> listaNueva = new ArrayList<Double>();
        
        if(x == 0){
            if(lista[x] % 2 == 0){
                listaNueva.add(lista[x]);
            }
        }else{
            if(lista[x] % 2 == 0){
                listaNueva.add(lista[x]);
                nuevaListaArray(lista , x - 1);
                return listaNueva;
            }else{
                nuevaListaArray(lista , x - 1);
            }
            
            
        }
        return listaNueva;
    }
    public static ArrayList paresN(int n){
        ArrayList<Integer> listaNuevap = new ArrayList<Integer>();
        if(n == 0){
            if(n % 2 == 0){
                listaNuevap.add(n);
            }
        }else{
            if(n % 2 == 0){
                listaNuevap.add(n);
                return paresN(n - 1);
            }else{
                return paresN(n - 1);
            }
        }
        return listaNuevap;
    }   
    public static int productoEscalar(int[] vector1 , int[] vector2 , int x){
        if(x == 0){
            return vector1[x] * vector2[x];
        }else{
            return (vector1[x] * vector2[x]) + productoEscalar(vector1 , vector2 , x - 1);
        }
    }
    
    public static double fibonacci(int n){
        if(n == 0){
            return 0;
        }else{
            if(n == 1){
                return 1;
            }else{
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }
    }
    
}

