package Clase7.ProblemasPropuestos;

import java.util.Scanner;

public class Problema1 {
    public static void main(String[]ar){
        Scanner teclado = new Scanner(System.in);
        int num1,num2;
        System.out.print("ingrese el primer numero: ");
        num1 = teclado.nextInt();
        System.out.print("ingrese el segundo numero: ");
        num2 = teclado.nextInt();
        if (num1>num2) {
            System.out.println("La suma de los 2 numeros es: "+ (num1+num2));
            System.out.print("la diferencia entre los 2 numeros es: " + (num1-num2));
        } else {
            System.out.println("El producto entre los 2 numeros es: " + (num1*num2));
            System.out.println("La Divicion entre los 2 numeros es: " + (num1/num2));
        }
    }
}
