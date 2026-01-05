package Clase5;

import java.util.Scanner;

public class AreaCuadrado {
    public static  void  main(String[] ar){
        Scanner teclado=new Scanner(System.in);
        int lado;
        int superficie;
        System.out.print("Ingrese la medida del lado: ");
        lado=teclado.nextInt();
        superficie= lado * lado;
        System.out.print("El area es: "+superficie);
        teclado.close();
    }
}


