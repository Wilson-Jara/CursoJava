//Escribir un programa que solicite la carga de un número entre 0 y 999, y nos muestre un mensaje de
//cuántos dígitos tiene el mismo. Finalizar el programa cuando se cargue el valor 0.

package Clase12;

import java.util.Scanner;

public class Clase12_1 {
    public static void main (String[]ar){
        Scanner teclado = new Scanner(System.in);
        int valor;

        do{
            System.out.print("ingrese un valor entre 0 y 999: ");
            valor = teclado.nextInt();
            if (valor>=100){
                System.out.println("El valor tiene 3 digitos");
            } else if (valor>=10){
                System.out.println("El valor tiene 2 digitos");
            } else{
                System.out.println("El valor tiene 1 digito");
            }
        } while (valor != 0);
    }
}
