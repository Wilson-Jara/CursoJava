//En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500, realizar un programa que lea
//los sueldos que cobra cada empleado e informe cuántos empleados cobran entre $100 y $300 y cuántos cobran más de $300.
//Además el programa deberá informar el importe que gasta la empresa en sueldos al personal.

package Clase10.ProblemasPropuestos;

import java.util.Scanner;

public class Problema3 {
    public static void main(String[] ar) {
        Scanner teclado=new Scanner(System.in);
        int n,x,conta1,conta2;
        float sueldo,gastos;
        System.out.print("Cuantos empleados tiene la empresa:");
        n=teclado.nextInt();
        x=1;
        conta1=0;
        conta2=0;
        gastos=0;
        while (x<=n) {
            System.out.print("Ingrese el sueldo del empleado:");
            sueldo=teclado.nextFloat();
            if (sueldo<=300) {
                conta1=conta1 + 1;
            } else {
                conta2=conta2 + 1;
            }
            gastos=gastos+sueldo;
            x=x + 1;
        }
        System.out.print("Cantidad de empleados con sueldos entre 100 y 300:");
        System.out.println(conta1);
        System.out.print("Cantidad de empleados con sueldos mayor a 300:");
        System.out.println(conta2);
        System.out.print("Gastos total de la empresa en sueldos:");
        System.out.println(gastos);
    }
}

