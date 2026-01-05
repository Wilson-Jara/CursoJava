package Clase6.Problemas_propuestos;

import java.util.Scanner;

public class SumaPromedio {
    public static void main(String[] as){
        Scanner teclado= new Scanner(System.in);
        int num1,num2,num3,num4,suma,promedio;
        System.out.print("Ingrese el primer numero: ");
        num1 = teclado.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        num2 = teclado.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        num3 = teclado.nextInt();

        System.out.print("ingrese el cuarto numero: ");
        num4 = teclado.nextInt();

        suma = num1 + num2 + num3 + num4;
        promedio= suma / 4;

        System.out.println("La suma de los numeros es: "+suma);
        System.out.println("el promedio de los numeros es: "+promedio);
        teclado.close();
    }
}
