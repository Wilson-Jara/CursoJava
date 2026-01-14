package Clase10;

import java.util.Scanner;

public class While2 {
    public static void main (String[]ar) {
        Scanner teclado = new Scanner(System.in);
        int x,suma,valor,promedio;

        x = 1;
        suma = 0;
        while (x <= 10) {
            System.out.print("Ingrese un valor entero: ");
            valor = teclado.nextInt();
            suma = suma + valor;
            x = x + 1;
        }
        promedio = suma / 10;
        System.out.println("La suma de todos los valores es de: " + suma);
        System.out.println("El promedio de los 10 valores es: " + promedio);
        teclado.close();
    }
}
