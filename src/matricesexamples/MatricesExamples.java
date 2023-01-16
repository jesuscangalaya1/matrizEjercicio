
package matricesexamples;

import java.util.Scanner;

public class MatricesExamples {
    public static void main(String[] args) {
        
        
    Double matriz[][] = new Double[4][4];
    Scanner teclado = new Scanner(System.in);
    Double suma = 0.0;

    //FOR PARA CARGAR.
    for (int f = 0; f < 4; f++) {
        for (int c = 0; c < 3; c++) {

            System.out.println("Ingrese el numero: " + f);
            matriz[f][c] = teclado.nextDouble();
            suma = suma + matriz[f][c];

        }
        matriz[f][3] = suma / 3;
        suma = 0.0;
    }
    //FOR PARA RECORRER.
    for (int f = 0; f < 4; f++) {
        System.out.println("Las notas del alumno: " + f + "son: ");
        for (int c = 0; c < 3; c++) {
            System.out.println("Nota: " + c + matriz[f][c]);
        }
        System.out.println("El promedio de las notas es: "+matriz[f][3]);   
    }
    }

}

