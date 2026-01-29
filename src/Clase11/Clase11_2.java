//Desarrollar un programa que permita la carga de 10 valores por teclado y nos muestre posteriormente la suma de los
//valores ingresados y su promedio. Este problema ya lo desarrollamos , lo resolveremos empleando la estructura for.

package Clase11;

import java.util.Scanner;

public class Clase11_2 {
    public static void main (String[]ar){
        Scanner teclado = new Scanner(System.in);
        int suma = 0;
        int valor;

        for (int f=1; f<=10; f++) {
            System.out.print("ingrese el valor: ");
            valor = teclado.nextInt();
            suma = suma + valor;
        }
        float promedio = suma/10;
        System.out.println("Suma de los 10 valores: " + suma);
        System.out.println("El promedio de los 10 valores es: " + promedio);
    }
}
