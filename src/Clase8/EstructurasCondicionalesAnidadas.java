package Clase8;

import java.util.Scanner;

public class EstructurasCondicionalesAnidadas {
    public static void main(String[]ar) {
        Scanner teclado = new Scanner(System.in);

        float nota1,nota2,nota3;
        System.out.print("Ingrese la primera nota: ");
        nota1 = teclado.nextFloat();
        System.out.print("ingrese la segunda nota: ");
        nota2 = teclado.nextFloat();
        System.out.print("ingrese la tercera nota: ");
        nota3 = teclado.nextFloat();
        float promedio= (nota1+nota2+nota3) / 3;
        System.out.println("Su promedio es: " + promedio);
        if (promedio>=7) {
            System.out.print("promocionado");
        } else {
            if (promedio>=4) {
            System.out.print("Regular");
            } else {
                System.out.print("Reprobado");
            }
            }
        }

    }

