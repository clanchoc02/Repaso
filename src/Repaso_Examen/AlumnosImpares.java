package Repaso_Examen;

import java.util.Scanner;

public class AlumnosImpares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número total de alumnos: ");
        int totalAlumnos = scanner.nextInt();
        
        int contadorImpares = 0;
        for (int i = 0; i < totalAlumnos; i++) {
            System.out.print("Ingrese el número de alumno: ");
            int numeroAlumno = scanner.nextInt();
            if (numeroAlumno % 2 != 0) { // Verificar si el número de alumno es impar
                contadorImpares++; // Incrementar el contador de alumnos impares
            }
        }
        
        System.out.println("El número total de alumnos impares es: " + contadorImpares);
    }
}
