package Clase6.Problemas_propuestos;

import java.util.Scanner;


///Realizar la carga del lado de un cuadrado, mostrar por
///pantalla el perímetro del mismo
///(El perímetro de un cuadrado se calcula multiplicando el valor del lado por cuatro)
public class perimetro_cuadrado {
    public static void main(String[]ar){
        Scanner teclado= new Scanner(System.in);
        float lado_numero;
        float perimetro_cuadrado;
        System.out.print("Ingrese valor del lado del cuadrado: ");
        lado_numero= teclado.nextFloat();
        perimetro_cuadrado= lado_numero * 4;
        System.out.print("el cuadrado tiene un perimetro de: "+perimetro_cuadrado);
        teclado.close();
    }
}
