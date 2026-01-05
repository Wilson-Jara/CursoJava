package Clase6;
import java.util.Scanner;

public class Suma_producto {
    public static void main(String[]as){
        Scanner teclado=new Scanner(System.in);

        int num1,num2,sum,producto;
        System.out.print("Ingrese el primer numero: ");
        num1= teclado.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2= teclado.nextInt();
        sum= num1+num2;
        producto= num1 * num2;
        System.out.println("La suma de los numeros es : "+sum);
        System.out.print("El produtco es: "+producto);
        teclado.close();
    }
}
//solo estoy probando y aprendiendo mas de git y github
