//Solicitar el ingreso del apellido, nombre y edad de dos personas. Mostrar el nombre de la persona con mayor edad.
//Realizar la carga del apellido y nombre en una variable de tipo String.

package Clase13;

import java.util.Scanner;

public class Clase13_2 {
    public static void main(String[]ar){
        Scanner teclado = new Scanner(System.in);
        String nombre1,nombre2;
        int edad1,edad2;

        System.out.print("Ingrese el primer nombre y apellido: ");
        nombre1 = teclado.nextLine();
        System.out.print("Ingrese la edad: ");
        edad1 = teclado.nextInt();

        System.out.print("Ingrese el segundo nombre y apellido: ");
        teclado.nextLine();
        nombre2 = teclado.nextLine();
        System.out.print("Ingrese la edad: ");
        edad2 = teclado.nextInt();

        if (edad1>edad2){
            System.out.println("La persona de mayor edad es: " + nombre1);
        } else {
            System.out.print("La persona de mayor edad es: " + nombre2);
        }


    }
}
