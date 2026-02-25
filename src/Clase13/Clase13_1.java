//Solicitar el ingreso del nombre y edad de dos personas. Mostrar el nombre de la persona con mayor edad.

package Clase13;

import java.util.Scanner;

public class Clase13_1 {
    public static void main(String[]ar){
        Scanner teclado = new Scanner(System.in);
        String nombre1,nombre2;
        int edad1,edad2;

        System.out.print("ingrese el primer nombre: ");
        nombre1 = teclado.next();
        System.out.print("Ingrese la edad: ");
        edad1 = teclado.nextInt();

        System.out.print("ingrese el segundo nombre: ");
        nombre2 = teclado.next();
        System.out.print("Ingrese la edad: ");
        edad2 = teclado.nextInt();

        if (edad1>edad2){
            System.out.println("La persona de mayor edad es: " + nombre1);
        } else{
            System.out.println("La persona de mayor edad es: " + nombre2);
        }
    }

}
