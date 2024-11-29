

import java.util.Scanner;

public class Ejercicio1 {

    public static Scanner cp = new Scanner(System.in);

    public static void main(String[] args) {

        DiagonalPrincipal(llenadoMatriz());
        DiagonalSecundaria(llenadoMatriz());
        Ordenar(llenadoMatriz());
        Buscar(llenadoMatriz());
        

    }

    private static int[][] llenadoMatriz() {

        System.out.println("\t\n--- Llenado de matriz ---\n");
        System.out.println("Ingrese la dimension de la matriz cuadrada: ");
        int n = cp.nextInt();
        int matriz[][] = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 50 + 1);

            }
        }
        System.out.println("\t\n---Mostrado de la matriz generada ---\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }

            System.out.println(" ");

        }
        return matriz;
    }


    private static void DiagonalPrincipal(int[][] matriz) {
        System.out.println("\n\t--- Diagonal principal ---\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    System.out.print(matriz[i][j] + " ");

                }
            }
            System.out.println(" ");
        }

    }

    private static void DiagonalSecundaria(int[][] matriz) {
        System.out.println("\n\t--- Diagonal secundaria ---\n");
        for (int i = 0; i < matriz.length; i++) {
          
           System.out.print(matriz[i][matriz.length -1 -i] + " ");
            }
          System.out.println(" ");
        }

        private static void Ordenar(int[][] matriz) {
      
            int aux ;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    for (int x = 0; x < matriz.length; x++) {
                        for (int y = 0; y < matriz[x].length; y++) {
                            if (matriz[i][j] > matriz[x][y]) {
                                
                                aux = matriz[i][j];
                                matriz[i][j] = matriz[x][y];
                                matriz[x][y] = aux;
                            }
                        }
                    }
                    
                }
    
            }
            System.out.println("\t\n--- matriz ordenada ---\n");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                   
                        System.out.print(matriz[i][j] + " ");
                }
                System.out.println(" ");
            }
        }
    
        private static void Buscar(int [][] matriz){
            System.out.println("\t\n--- Buscar un dato en la matriz ---\n");
            System.out.println("Ingrese el numero a buscar:");
            int numeroBuscar = cp.nextInt();
            int contador = 0;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if(matriz[i][j] == (numeroBuscar)){
                        contador++;
                    }
                }
            }
            if(contador > 0){
                System.out.println("El número se repite " + contador + " veces");
            }else{
               System.out.println("EL número a buscar no se encuentra dentro de la matriz"); 
            }

        }
    }



