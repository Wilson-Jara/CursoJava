/// Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número es positivo, nulo o negativo.

package Clase8.ProblemasPropuestos;

import java.util.Scanner;

public class Problema2 {
    public static void main(String[] ar) {
        Scanner teclado = new Scanner(System.in);
        int num1;

        System.out.print("ingrese un numero: ");
        num1 = teclado.nextInt();

        if (num1==0){
            System.out.print("Tu numero es 0");
        } else if (num1 > 0){
            System.out.print("tu numero es positivo");
        } else{
            System.out.print("tu numero es negativo");
        }
    }
}