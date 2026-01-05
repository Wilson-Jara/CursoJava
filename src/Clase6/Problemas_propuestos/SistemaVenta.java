package Clase6.Problemas_propuestos;

import java.util.Scanner;

public class SistemaVenta {
    public static void main(String[]as){
        Scanner teclado= new Scanner(System.in);
        float PrecioProducto,abono;
        int cantidad;

        System.out.print("Ingrese el precio del producto: ");
        PrecioProducto = teclado.nextFloat();

        System.out.print("Ingrese la cantidad del producto: ");
        cantidad = teclado.nextInt();

        abono= PrecioProducto * cantidad;

        System.out.print("El precio del producto es de: $" + PrecioProducto + ", con una cantidad de: " + cantidad + ", El valor a abonar es de: $" + abono);

        teclado.close();
    }
}
