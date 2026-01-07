package Clase7;

import java.util.Scanner;

public class EstructurasCondicionales {
    public static void main(String[] as) {
        Scanner teclado = new Scanner(System.in);

        float sueldo;
        System.out.print("ingrese sueldo: $");
        sueldo = teclado.nextFloat();
        if (sueldo>3000){
            System.out.print("Esta persona debe abonar impuestos");
        }
    }
}
