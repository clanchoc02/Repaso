package Repaso_Examen;

import java.util.Scanner;

public class Rapso_Arreglado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalAlumnos;

        // Pedir al usuario el número total de alumnos y validar la entrada
        do {
            System.out.print("Ingrese el número total de alumnos (debe ser un número positivo): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número positivo.");
                System.out.print("Ingrese el número total de alumnos (debe ser un número positivo): ");
                scanner.next();
            }
            totalAlumnos = scanner.nextInt();
            if (totalAlumnos <= 0) {
                System.out.println("Error: Debe ingresar un número positivo.");
            }
        } while (totalAlumnos <= 0);

        int contadorImpares = 0;

        // Contar el número de alumnos impares
        for (int i = 1; i <= totalAlumnos; i++) {
            System.out.print("Ingrese el número de alumno " + i + ": ");
            int numeroAlumno = scanner.nextInt();
            if (numeroAlumno % 2 != 0) { // Verificar si el número de alumno es impar
                contadorImpares++; // Incrementar el contador de alumnos impares
            }
        }

        // Mostrar el resultado
        System.out.println("El número total de alumnos impares es: " + contadorImpares);

        // Cerrar el scanner
        scanner.close();
    }
}
