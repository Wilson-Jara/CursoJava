package Clase6.Problemas_propuestos;
import java.util.Scanner;
//Escribir un programa en el cual se ingresen cuatro números
// calcular e informar la suma de los dos primeros y el producto del tercero y el cuarto.
public class suma_Producto {
    public static void  main(String[] as){
        Scanner teclado = new Scanner(System.in);
        int num1,num2,num3,num4,suma,producto;
        System.out.print("Ingrese el primer numero: ");
        num1 = teclado.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        num2 = teclado.nextInt();

        System.out.print("ingrese el tercer numero: ");
        num3 = teclado.nextInt();

        System.out.print("ingrese el cuarto numero: ");
        num4 = teclado.nextInt();

        suma = num1 + num2;
        producto = num3 * num4;

        System.out.println("la suma del primer y segundo numero es: "+suma);
        System.out.println("El producto del tercer y cuarto numero es: "+producto);

        teclado.close();
    }
}
