//Se realiza la carga de 10 valores enteros por teclado. Se desea conocer:
//a) La cantidad de valores ingresados negativos.
//b) La cantidad de valores ingresados positivos.
//c) La cantidad de múltiplos de 15.
//d) El valor acumulado de los números ingresados que son pares.

package Clase11.ProblemasPropuestos;

import java.util.Scanner;

public class Problema7 {
    public static void main(String[] ar) {
        Scanner teclado=new Scanner(System.in);
        int f,valor,negativos,positivos,mult15,sumapares;
        negativos=0;
        positivos=0;
        mult15=0;
        sumapares=0;
        for(f=1;f<=10;f++) {
            System.out.print("Ingrese valor:");
            valor=teclado.nextInt();
            if (valor<0) {
                negativos++;
            } else {
                if (valor>0) {
                    positivos++;
                }
            }
            if (valor%15==0) {
                mult15++;
            }
            if (valor%2==0) {
                sumapares=sumapares+valor;
            }
        }
        System.out.print("Cantidad de valores negativos:");
        System.out.println(negativos);
        System.out.print("Cantidad de valores positivos:");
        System.out.println(positivos);
        System.out.print("Cantidad de valores múltiplos de 15:");
        System.out.println(mult15);
        System.out.print("Suma de los valores pares:");
        System.out.println(sumapares);
    }
}
