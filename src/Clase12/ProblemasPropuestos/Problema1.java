//Realizar un programa que acumule (sume) valores ingresados por teclado hasta ingresar el 9999 (no sumar dicho valor, indica que ha finalizado la carga).
//Imprimir el valor acumulado e informar si dicho valor es cero, mayor a cero o menor a cero.

package Clase12.ProblemasPropuestos;

import java.util.Scanner;

public class Problema1 {
    public static void main(String[]ar){
        Scanner teclado = new Scanner(System.in);
        int numIngresado;
        int totalSuma= 0;

        do{
            System.out.println("Ingrese un numero (9999 para terminar): ");
            numIngresado = teclado.nextInt();
            if (numIngresado!=9999){
                totalSuma = totalSuma + numIngresado;
            }
        } while (numIngresado != 9999);

        if (totalSuma > 0){
            System.out.println("La suma de los valores es mayor a 0");
        } else if (totalSuma == 0){
            System.out.println("La suma de los valores es  0");
        } else{
            System.out.println("La suma de los valores es menor a 0");
        } teclado.close();
    }
}
