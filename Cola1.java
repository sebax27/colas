
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cola1 {

    private static final Scanner cp = new Scanner(System.in);

    public static void main(String[] args) {

        //     1) crear un programa que con el ingreso de una matriz n* n muestre las siguientes opciones
// 1: método pila con la suma de las filas de la matriz
// 2: método cola con la suma de las columnas de la matriz
// 3: método donde muestre la factorial de la dimensión de la matriz
// 4: método cola donde muestre los números ordenados de mayor a menor de la cola

        System.out.println("\t\n--- Primer ejercicio ---\n");

        System.out.println("Ingrese la dimension de la matriz n * n: ");
        int n = cp.nextInt();

        ColaOrdenada(cola(matriz(n)));

    }

    private static int[][] matriz(int n) {

        int m[][] = new int[n][n];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Ingrese un dato para la matriz n * n en la posicion: " + "[" + i + "]" + "[" + j + "]");
                m[i][j] = cp.nextInt();
            }

        }

        return m;
    }

    private static Queue<Integer> cola(int[][] m) {
       
        System.out.println("\t\n--- Sumando las columnas de la matriz ---\n ");
        Queue<Integer> c = new LinkedList<>();
        for (int j = 0; j < m.length; j++) {
            int suma = 0;
            for (int i = 0; i < m.length; i++) {
                suma += m[i][j];
            }

            c.add(suma);
        }

        System.out.println(c);

        return c;
    }

    private static Queue<Integer> ColaOrdenada(Queue<Integer> cola) {

        System.out.println("\t\n--- Cola ordenada ---\n");
        
        LinkedList<Integer> lista = new LinkedList<>(cola);
        
        Collections.reverse(lista);

        System.out.println(lista);

        return cola;
    }
}
