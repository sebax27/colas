
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cola2 {

    private static final Scanner cp = new Scanner(System.in);

    public static void main(String[] args) {

//         8) crear un programa que reciba dos matrices n * n y que por medio de una cola haga lo siguiente:
// 1: multiplicar matriz a * matriz b mostrar el resultado en una cola
// 2: la media de la matriz a y la matriz b y mostrar cual es mayor
// 3: la factorial de la media de la matriz a y matriz b
// 4: los números negativos se debe evaluar y cambiar por 0
        System.out.println("Ingrese la dimensión de la matriz: ");
        int n = cp.nextInt();

        int[][] matriz1 = matrices(n);
        int[][] matriz2 = matrices(n);

        Queue<Integer> cola = colaMultiplicacion(matriz1, matriz2);
        System.out.println(cola);

        // 2. Calcular la media de las matrices
        double mediaA = calcularMedia(matriz1);
        double mediaB = calcularMedia(matriz2);
        System.out.println("Media de matriz A: " + mediaA);
        System.out.println("Media de matriz B: " + mediaB);
        if (mediaA > mediaB) {
            System.out.println("La matriz A tiene una media mayor.");
        } else {
            System.out.println("La matriz B tiene una media mayor.");
        }
        // 3. Calcular el factorial de las medias
        System.out.println("Factorial de la media de A: " + calcularFactorial((int) mediaA));
        System.out.println("Factorial de la media de B: " + calcularFactorial((int) mediaB));


    }

    private static int[][] matrices(int n) {

        int[][] matriz = new int[n][n];

        System.out.println("\t\n--- Primera matriz ---\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 50 + 1);
                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();

        }
        return matriz;
    }

    private static Queue<Integer> colaMultiplicacion(int[][] m1, int[][] m2) {
        int n = m1.length; // Dimensión de las matrices
        Queue<Integer> resultado = new LinkedList<>();
    
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int multiplicacion = 0;
                for (int k = 0; k < n; k++) {
                    multiplicacion += m1[i][k] * m2[k][j];
                }
                resultado.offer(multiplicacion); // Agregamos directamente a la cola
            }
        }
        
        System.out.println("Resultado de la multiplicacion es: ");
       
        return resultado; 


    }

    private static double calcularMedia(int[][] matriz) {
        int suma = 0, totalElementos = matriz.length * matriz.length;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return (double) suma / totalElementos;
    }

    // Calcular el factorial de un número
    private static long calcularFactorial(int media) {
        long factorial = 1;
        for (int i = 2; i <= media; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
