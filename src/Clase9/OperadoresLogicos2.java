package Clase9;

import java.util.Scanner;

public class OperadoresLogicos2 {
    public static void main (String[]ar) {
        Scanner teclado = new Scanner(System.in);

        int dia,mes,anio;
        System.out.print("Ingrese el dia: ");
        dia = teclado.nextInt();
        System.out.print("Ingrese el mes: ");
        mes = teclado.nextInt();
        System.out.print("Ingrese el año: ");
        anio = teclado.nextInt();

        if (mes == 1 || mes == 2 || mes==3 ){
            System.out.print("Corresponde al primer trimestre");
        }
        teclado.close();
    }
}
