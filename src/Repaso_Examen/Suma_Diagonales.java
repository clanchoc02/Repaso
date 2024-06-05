package Repaso_Examen;

import java.util.Scanner;
import java.util.Random;
class Hola {
	
	static void inicializar(int[][] matriz){
       Random r = new Random();
       for(int i=0;i<matriz.length;i++){
           for(int j=0;j<matriz[i].length;j++){
               matriz[i][j] = (int) (Math.random() + 1);  
           }
       }
   }
	static void visualizar(int[][] matriz){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

	 static int sumarDiagonal(int[][] matriz) {
	        int suma = 0;
	        int x = 0, y = 0;
	        while (x < matriz.length && y < matriz[0].length) {
                suma += matriz[y][x];
                x++;
                y++;
            }
            x = 0;
            y = matriz.length - 1;
            while (x < matriz.length && y >= 0) {
            	 if (x!=y) suma += matriz[y][x];
                x++;
                y--;
            }
	     
	           
	        //Comprobamos si es cuadrada impar(restamos central) par 
	        return suma;
	    }
public static void main(String[] args) {
	//Deberíamos pedir NxM por teclado
	int[][] matrizNumeros = new int[6][6];
    inicializar(matrizNumeros);
    visualizar(matrizNumeros);
    int sumaDiagonales = sumarDiagonal(matrizNumeros);
     System.out.printf("La suma de las diagonales  es %d \n", sumaDiagonales);
}

}