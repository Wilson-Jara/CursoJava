//Escribir un programa que lea 10 números enteros y luego muestre cuántos valores ingresados fueron múltiplos de 3
// y cuántos de 5. Debemos tener en cuenta que hay números que son múltiplos de 3 y de 5 a la vez.

package Clase11;

import java.util.Scanner;

public class Clase11_4 {
    public static void main(String[]ar){
        Scanner teclado = new Scanner(System.in);
        int mul3 = 0;
        int mul5 = 0;
        int valor;

        for(int f=1 ; f<=10 ;f++){
            System.out.print("Ingrese el valor: ");
            valor = teclado.nextInt();

            if ((valor%3)==0){
                mul3 ++;
            }
            if((valor%5)==0) {
                mul5++;
            }
        }
        System.out.println("Los valores multiplos de 3: " + mul3);
        System.out.println("Los valores multiplos de 5: " + mul5);
    }
}
