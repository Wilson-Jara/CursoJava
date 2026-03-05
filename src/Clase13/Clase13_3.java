package Clase13;

import java.util.Scanner;

public class Clase13_3 {
    public static void main (String[]ar){
        Scanner teclado = new Scanner(System.in);
        String apellido1,apellido2;

        System.out.print("Ingrese el primer apellido: ");
        apellido1 = teclado.nextLine();

        System.out.print("Ingrese el segundo apellido: ");
        apellido2 = teclado.nextLine();

        if (apellido1.equals(apellido2)){
            System.out.print("Los apellidos son iguales");
        } else {
            System.out.print("Los apellidos son distintos");
        }

    }
}
