//En un banco se procesan datos de las cuentas corrientes de sus clientes. De cada cuenta
//corriente se conoce: número de cuenta y saldo actual. El ingreso de datos debe finalizar
//al ingresar un valor negativo en el número de cuenta.
//Se pide confeccionar un programa que lea los datos de las cuentas corrientes e informe:

//a)De cada cuenta: número de cuenta y estado de la cuenta según su saldo, sabiendo que:
//Estado de la cuenta	'Acreedor' si el saldo es >0.
//			'Deudor' si el saldo es <0.
//			'Nulo' si el saldo es =0.

//b) La suma total de los saldos acreedores.

package Clase12.ProblemasPropuestos;

import java.util.Scanner;

public class Problema2 {
    public static void main (String[]ar) {
        Scanner teclado = new Scanner(System.in);
        int suma = 0;
        int cantAcreedor = 0;
        int cantDeudor = 0;
        int cantNulo = 0;
        int numCuenta;

        do {
            System.out.println("Ingrese su numero de cuenta (numero negativo para salir): ");
            numCuenta = teclado.nextInt();
            if (numCuenta > 0) {
                System.out.print("Ingrese el saldo de la cuenta: ");
                int valor = teclado.nextInt();
                if (valor > 0) {
                    cantAcreedor += 1;
                    suma += valor;
                    System.out.println("Cuenta: " + numCuenta + "- Estado : Acreedor");
                } else if (valor == 0) {
                    cantNulo += 1;
                    System.out.println("Cuenta: " + numCuenta + "- Estado : Nulo");
                } else {
                    cantDeudor += 1;
                    System.out.println("Cuenta: " + numCuenta + "- Estado : Deudor");
                }
            }
        }while (numCuenta>=0);
        System.out.println("Numero de clientes acreedores: " + cantAcreedor);
        System.out.println("Numero de clientes deudores: " + cantDeudor);
        System.out.println("Numero de clientes nulos: " + cantNulo);
        System.out.println("Suma total de acreedores: " + suma);
    }

}
