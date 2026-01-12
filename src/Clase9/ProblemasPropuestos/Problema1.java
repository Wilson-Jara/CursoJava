/// Realizar un programa que pida cargar una fecha cualquiera,
/// luego verificar si dicha fecha corresponde a Navidad

package Clase9.ProblemasPropuestos;

import java.util.Scanner;

public class Problema1 {
    public static void main (String[]ar){
        Scanner teclado = new Scanner(System.in);

        int dia,mes,anio;
        System.out.println("Ingrese la fecha de hoy (dia-mes-año)");
        System.out.print("Ingrese el dia: ");
        dia = teclado.nextInt();
        System.out.print("Ingrese el mes: ");
        mes = teclado.nextInt();
        System.out.print("ingrese el año: ");
        anio = teclado.nextInt();

        if (dia == 24 && mes == 12){
            System.out.print("Hoy es NAVIDAD");
        }
    }
}
