package principal;
import operativa.Aplicacion;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

public class Principal {

    public static void main(String args[]){
        
        double[] lista = {4 , 5 , 2 , 9};
        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        int vector1 [] = {1 , 2 , 3 , 4};
        int vector2 [] = {5 , 6 , 7 , 8};

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero para realizar su sumatoria: ");
        n = sc.nextInt();
        System.out.println("El resusultado es " + Aplicacion.sumatorio(n));
        sc.nextLine();
        System.out.println("Introduce un número para realizar su factorial: ");
        f = sc.nextInt();
        System.out.println("El resultado es " + Aplicacion.factorial(f));
        System.out.println("Potencia");
        System.out.println("El numero natural ");
        m = sc.nextInt();
        System.out.println("Elevado a que numero entero?");
        p = sc.nextInt();
        System.out.println("El resultado de la potencia es " + Aplicacion.potencia_enesima(m , p));
        System.out.println();
        System.out.println("El resultado de la suma de los elementos es " + Aplicacion.sumaDeArray(lista , lista.length - 1));
        System.out.println(); 
        //Crear a Willy object para acoger su resujtado y operar con él
        double Willy = Aplicacion.sumaDeArray(lista, lista.length - 1);
        System.out.println("La media de los elementos es " + (Willy / (lista.length)));
        System.out.println();
        double Willy2 = (Aplicacion.desviacionDeArray(lista, lista.length - 1));
        System.out.println("La desviación típica es " + (Math.sqrt(Willy2 / lista.length)));
        System.out.println();
        System.out.println("Hasta que número quieres realizar la suma?");
        x = sc.nextInt();
        System.out.println("La suma de los elementos pares hasta " + x + " es " + Aplicacion.sumaDePares(x));
        System.out.println();
        System.out.println("Los elementos pares del array son " + Aplicacion.sumaDeParesLista(lista , lista.length - 1));
        System.out.println();
        System.out.println("La nueva lista de los números pares es " + Aplicacion.nuevaListaArray(lista , lista.length - 1));
        System.out.println();
        System.out.println("Introduce un número para realizar una lista de los números pares hasta ese número ");
        h = sc.nextInt();
        System.out.println("La lista de los números pares es hasta el " + h + (" ") + Aplicacion.paresN(h));
        System.out.println("El producto de los elementos de la lista es " + Aplicacion.productoEscalar(vector1 , vector2 , 3));
        System.out.println();
        System.out.println("Introduce un número para realizar la serie de Fibonnaci ");
        o = sc.nextInt();
        System.out.println("La serie de Fibonnaci es " + Aplicacion.fibonacci(o));
        System.out.println();
        System.out.println("El resulado del cociente entre el decimo tercero y el decimo segundo es " + (Aplicacion.fibonacci(13) / Aplicacion.fibonacci(12)));
        System.out.println("El resultado de 1 + raiz de 5 todo eso entre 2 es " + ((1 + Math.sqrt(5)) / 2));
        System.out.println("La relación entre la razón aurea y la sucesión de Fibonacci, es que cualquier número de la sucesión de Fibonacci dividido por su predecesor da como resultado 1,61803 que es el número aureo");
        sc.close();


   } 
    public static int l = 13;
    public static float u;
    public static float g;  
    public static int o; 
    public static int h;
    public static int i;
    public static int z;
    public static int t; 
    public static int x;
    public static double b;
    public static double a;
    public static int n;
    public static int f;
    public static int p;
    public static int m;
    public static int sa;
    

}
