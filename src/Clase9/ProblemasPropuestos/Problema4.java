/// Escribir un programa que pida ingresar la coordenada de un punto en el plano,
/// es decir dos valores enteros x e y (distintos a cero).
/// Posteriormente imprimir en pantalla en que cuadrante se ubica dicho punto.
///  (1º Cuadrante si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0)
///  (3º cuadrante si x < 0 Y y < 0 , 4º cuadrante: x > 0 Y y < 0)

package Clase9.ProblemasPropuestos;

import java.util.Scanner;

public class Problema4 {
    public static void main(String[]ar) {
        Scanner teclado = new Scanner(System.in);

        int coordX,coordY;
        System.out.println("Ingrese las coordenadas X e Y (No pueden ser coordenadas origen)");
        System.out.print("Ingrese la coordenada X: ");
        coordX = teclado.nextInt();
        System.out.print("ingrese la coordenada Y: ");
        coordY = teclado.nextInt();

        if (coordX != 0 && coordY != 0) {
            if (coordX > 0 && coordY > 0){
                System.out.print("Las coords estan en el primer cuadrante");
            } else if (coordX < 0 && coordY > 0){
                System.out.print("Las coords estan en el segundo cuadrante");
            } else if (coordX < 0 && coordY < 0){
                System.out.print("Las coords estan en el tercer cuadrante");
            } else {
                System.out.print("las coords estan en el cuarto cuadrante");
            }
        } else {
            System.out.print("Error no pueden ser 0");
        }
    }
}



