/// Confeccionar un programa que permita cargar un número entero positivo de hasta tres cifras y muestre
/// un mensaje indicando si tiene 1, 2, o 3 cifras. Mostrar un mensaje de error si el número de cifras es mayor.

package Clase8.ProblemasPropuestos;

import java.util.Scanner;

public class Problema3 {
    public static void main(String[]ar){
        Scanner teclado = new Scanner(System.in);

        int num1;
        System.out.print("ingrese un numero de hasta 3 cifras: ");
        num1 = teclado.nextInt();

        if (num1<10) {
            System.out.print("EL numero tiene 1 digito");
        } else if (num1 < 100) {
            System.out.print("el numero tiene 2 digito");
        } else if (num1 < 1000){
            System.out.print("El numero tiene 3 digito");
        } else {
            System.out.print("Error el numero tiene que tener max 3 digito");
        }
    }
}
