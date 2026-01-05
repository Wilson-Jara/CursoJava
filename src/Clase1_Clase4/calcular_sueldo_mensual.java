package Clase1_Clase4;

import java.util.Scanner;

public class calcular_sueldo_mensual {
    public static void main(String[] ar) {
        Scanner teclado= new Scanner(System.in);

        int horas_trabajadas;
        float costo_horas;
        float sueldo;

        System.out.print("Ingrese las horas trabjadas: ");
        horas_trabajadas= teclado.nextInt();
        System.out.print("costo por hora: $");
        costo_horas= teclado.nextFloat();
        sueldo= horas_trabajadas * costo_horas;
        System.out.print("el sueldo es: $"+sueldo);
    }

}
