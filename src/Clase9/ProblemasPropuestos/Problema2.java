/// Se ingresan tres valores por teclado, si todos son iguales
/// se imprime la suma del primero con el segundo y a este resultado
///  se lo multiplica por el tercero.

package Clase9.ProblemasPropuestos;

import java.util.Scanner;

public class Problema2 {
    public static void main(String[]ar){
        Scanner teclado = new Scanner(System.in);

        int num1,num2,num3;
        System.out.println("Ingrese 3 numeros iguales");
        System.out.print("Ingrese el primer numero: ");
        num1 = teclado.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = teclado.nextInt();
        System.out.print("ingrese el tercer numero: ");
        num3 = teclado.nextInt();

        if (num1 == num2 && num1 == num3){
            int suma,multiplicacion;
            suma = (num1 + num2);
            multiplicacion = (suma * num3);
            System.out.println("La suma del primer y segundo numero es: " + suma);
            System.out.print("Y la multiplicacion de ese resultado con el tercer numero es: " + multiplicacion);
        }

    }
}
