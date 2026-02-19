//Escribir un programa que solicite la carga de números por teclado, obtener su promedio. Finalizar la carga de
//valores cuando se cargue el valor 0.
//
//Cuando la finalización depende de algún valor ingresado por el operador conviene el empleo de la estructura do
//while, por lo menos se cargará un valor
//(en el caso más extremo se carga 0, que indica la finalización de la carga de valores)

package Clase12;

import java.util.Scanner;

public class Clase12_2 {
    public static void main(String[]ar){
        Scanner teclado = new Scanner(System.in);
        int suma = 0;
        int cant = 0;
        int valor = 0;

        do{
            System.out.print("Ingrese el valor (0 para finalizar): ");
            valor = teclado.nextInt();
            if (valor != 0){
                suma = suma + valor;
                cant = cant + 1;
            }
        } while (valor!=0);
        if (cant != 0){
            int promedio = suma/cant;
            System.out.println("El promedio es: " + promedio);
        } else{
            System.out.println("No se ingresaron valores");
        }
    }

}
