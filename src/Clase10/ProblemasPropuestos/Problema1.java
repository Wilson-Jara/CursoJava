/// Escribir un programa que solicite ingresar notas de alumnos y nos informe cuántos
/// tienen notas mayores o iguales a 4 y cuántos menores

package Clase10.ProblemasPropuestos;

import java.util.Scanner;

public class Problema1 {
    public static void main(String[]ar) {
        Scanner teclado = new Scanner(System.in);

        int x,cant,n;
        float nota;
        x = 1;
        cant = 0;
        System.out.print("ingrese la cantidad de notas a ingresar: ");
        n = teclado.nextInt();

        while (x <= n){
            System.out.print("ingrese la nota N° " + x + ": ");
            nota = teclado.nextFloat();
            if (nota >= 4){
                cant = cant + 1;
            }
            x = x + 1;
        }
        System.out.print("La cantidad de notas arriba de 4 son :" + cant);
    }
}
