//Desarrollar un programa que solicite la carga de 10 números e imprima la suma de los últimos 5 valores ingresados.

package Clase11.ProblemasPropuestos;

import java.util.Scanner;

public class Problema2 {
    public static void main(String[]ar){
        Scanner teclado = new Scanner(System.in);
        int sumaTotal = 0;
        int f,numeroIngresado;

        for (f=1 ; f<=10 ; f++){
            System.out.print("Ingrese el numero: ");
            numeroIngresado = teclado.nextInt();
            if (f>5){
                sumaTotal = sumaTotal + numeroIngresado;
            }
        }
        System.out.print("La suma de los ultimos 5 numeros es: " + sumaTotal);
    }
}
