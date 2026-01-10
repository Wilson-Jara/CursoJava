/// Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información:
/// cantidad total de preguntas que se le realizaron y la cantidad de preguntas
/// que contestó correctamente. Se pide confeccionar un programa que ingrese los dos datos por teclado e
/// informe el nivel del mismo según el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
/// Nivel máximo:	Porcentaje>=90%.
/// Nivel medio:	Porcentaje>=75% y <90%.
/// Nivel regular:	Porcentaje>=50% y <75%.
/// Fuera de nivel:	Porcentaje<50%.

package Clase8.ProblemasPropuestos;

import java.util.Scanner;

public class Problema4 {
    public static void main(String[]ar) {
        Scanner teclado = new Scanner(System.in);

        int Puntaje, PuntajeMax,Porcentaje;

        System.out.print("Ingrese el puntaje maximo de la prueba: ");
        PuntajeMax = teclado.nextInt();
        System.out.print("Ingrese el puntaje obtenido: ");
        Puntaje = teclado.nextInt();

        Porcentaje = (Puntaje * 100) / PuntajeMax;

        if (Porcentaje >= 90){
            System.out.println("Nivel max");
        } else if (Porcentaje >= 75) {
            System.out.println("Nivel medio");
        } else if (Porcentaje >= 50) {
            System.out.println("Nivel Regular");
        } else {
            System.out.println("Fuera de nivel");
        }
    }
}
