/// Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de ellos.

package Clase8.ProblemasPropuestos;

import java.util.Scanner;

public class Problema1 {
    public static void main(String[]ar){
        Scanner teclado = new Scanner(System.in);

        int num1,num2,num3;
        System.out.print("Ingrese el primer numero: ");
        num1 = teclado.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = teclado.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        num3 = teclado.nextInt();

        if (num1>num2) {
            if (num1 > num3){
            System.out.print("el numero mayor es: " + num1);
            }else {
                System.out.print("El numero mayor es: " + num3);
            }
        }else {
            if (num2>num3){
                System.out.print("El numero mayor es: " + num2);
            } else {
                System.out.print("El numero mayor es: " + num3);
            }
        }
    }
}
