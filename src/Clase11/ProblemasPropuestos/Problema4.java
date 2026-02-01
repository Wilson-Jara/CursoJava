//Confeccionar un programa que permita ingresar un valor del 1 al 10 y nos muestre la tabla
//de multiplicar del mismo (los primeros 12 términos)
//Ejemplo: Si ingreso 3 deberá aparecer en pantalla los valores 3, 6, 9, hasta el 36.

package Clase11.ProblemasPropuestos;

import java.util.Scanner;

public class Problema4 {
    public static void main(String[]ar){
        Scanner teclado = new Scanner(System.in);
        int numero,f;
        int contador;

        System.out.print("Ingrese un numero: ");
        numero = teclado.nextInt();
        contador = numero;

        for (f=1 ; f<=12 ; f++){
            System.out.println(contador);
            contador =  contador + numero;
        }
    }

}
