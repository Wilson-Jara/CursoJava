//Escribir un programa que lea 10 notas de alumnos y nos informe cuántos tienen notas mayores o
//iguales a 7 y cuántos menores.
//Para resolver este problema se requieren tres contadores:
//
//aprobados (Cuenta la cantidad de alumnos aprobados)
//reprobados (Cuenta la cantidad de reprobados)
//f (es el contador del for)

package Clase11;

import java.util.Scanner;

public class Clase11_3 {
    public static void main(String[]ar){
        Scanner teclado = new Scanner(System.in);
        int aprobados = 0;
        int reprobados= 0;
        float nota;
        for (int f=1 ; f<=10 ; f++){
            System.out.println("Ingrese la nota: ");
            nota = teclado.nextFloat();
            if (nota>=7){
                aprobados ++;

            } else {
                reprobados ++;
            }
        }
        System.out.println("cantidad de alumnos mayores a 7: " + aprobados);
        System.out.println("Cantidad de alumnos menores a 7: " + reprobados);
    }
}
