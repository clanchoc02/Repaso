package Repaso_Examen;

import java.util.Scanner;

public class Matriz {
    
    public static void main(String[] args) {
 
        Scanner sn = new Scanner(System.in);
        int matriz[][] = new int[4][4];
        boolean salir = false;
        int opcion, fila, columna;
        boolean rellenado = false;

        do {
            System.out.println("Menu");
            System.out.println("1. Rellenar Matriz");
            System.out.println("2. Sumar fila");
            System.out.println("3. Sumar columna");
            System.out.println("4. Suma diagonal principal");
            System.out.println("5. Suma diagonal inversa");
            System.out.println("6. Media elementos");
            System.out.println("7. Salir");
            System.out.println("Elije una opcion");
            opcion = sn.nextInt();
            
            if (rellenado) 
                showMatriz(matriz);
            
            switch (opcion) {
                case 1:
                    rellenarMatriz(matriz);
                    rellenado = true;
                    break;
                case 2:
                    if (rellenado) {
                        System.out.println("Elige una fila");
                        fila = sn.nextInt();
                        System.out.println("La suma de los valores de la fila " + fila + " es: " + sumaFila(matriz, fila));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 3:
                    if (rellenado) {
                        System.out.println("Elige una columna");
                        columna = sn.nextInt();
                        System.out.println("La suma de los valores de la columna " + columna + " es: " + sumaColumna(matriz, columna));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 4:
                    if (rellenado) {
                        System.out.println("La suma de la diagonal principal es: " + sumaDiagonalPrinc(matriz));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 5:
                    if (rellenado) {
                        System.out.println("La suma de la diagonal inversa es: " + sumaDiagonalInversa(matriz));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 6:
                    if (rellenado) {
                        System.out.println("La media de los valores de la matriz es: " + media(matriz));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("Tienes que meter un valor entre 1 y 7");
            }
        } while (!salir);
 
        System.out.println("FIN");
    }
 
    public static void showMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void rellenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 9 + 1);
            }
        }
    }
 
    public static int sumaFila(int[][] matriz, int fila) {
        int suma = 0;
        for (int j = 0; j < matriz[0].length; j++) {
            suma += matriz[fila][j];
        }
        return suma;
    }
 
    public static int sumaColumna(int[][] matriz, int columna) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][columna];
        }
        return suma;
    }
 
    public static int sumaDiagonalPrinc(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }
        return suma;
    }
 
    public static int sumaDiagonalInversa(int[][] matriz) {
        int suma = 0;
        for (int i = 0, j = matriz.length - 1; i < matriz.length; i++, j--) {
            suma += matriz[i][j];
        }
        return suma;
    }
 
    public static double media(int[][] matriz) {
        double suma = 0;
        int totalElementos = matriz.length * matriz[0].length;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma / totalElementos;
    }
}

