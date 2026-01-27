//Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 - 16 - 24, etc.

package Clase10.ProblemasPropuestos;

public class Problema5 {
    public static void main(String[] ar) {
        int mult8;
        mult8=8;
        while (mult8<=500) {
            System.out.print(mult8);
            System.out.print(" - ");
            mult8=mult8 + 8;
        }
    }
}

