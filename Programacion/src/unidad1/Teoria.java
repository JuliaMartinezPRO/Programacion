/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad1;

/**
 *
 * @author marfonjul
 */
public class Teoria {

    public static void main(String [] args) {

        int importe = 100;
        int descuento = 10;
        int inicio, fin;
        int limite = 100, base = 0;
        System.out.println("El importe es " + importe + " y el descuento " + descuento);

        String mensaje = " El importe es ";
        String mensaje1 = " y el descuento ";
        System.out.println(mensaje + importe + mensaje1 + descuento);

        final double IVA = 21;
        System.out.println(" El IVA es " + IVA);

        int num1 = 5; //ejercico coversión automática de tipos
        int num2 = 7;
        System.out.println(" La suma de " + num1 + " y de " + num2 + " es " + (num1 + num2));

//Ejercicio de Conversión de tipo casting
        int a = 50;
        byte b = (byte) (a * 2);
//casting de tipo int a byte hay que especificar el cast
        System.out.println(b);

//Ejercicio de tipo casting
        double d = 100.04;
        long l = (long) d;
        int i = (int) l;
        System.out.println("Valor double " + d);
        System.out.println("Valor long " + l);
        System.out.println("Valor int " + i);
    }
}
