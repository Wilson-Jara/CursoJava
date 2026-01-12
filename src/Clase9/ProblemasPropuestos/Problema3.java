/// Se ingresan por teclado tres números, si todos los valores ingresados son menores a 10,
/// imprimir en pantalla la leyenda "Todos los números son menores a diez"

package Clase9.ProblemasPropuestos;

import java.util.Scanner;

public class Problema3 {
    public static void main(String[]ar){
        Scanner teclado = new Scanner(System.in);

        int num1,num2,num3;
        System.out.println("Ingrese 3 numeros menores a 10");
        System.out.print("Ingrese el primer numero: ");
        num1 = teclado.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = teclado.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        num3 = teclado.nextInt();

        if (num1 < 10 && num2 < 10 && num3 < 10){
            System.out.print("Todos los numeros son menores a 10 ");
        }
    }
}
