/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.paquete;
import java.util.Scanner;

/**
 *
 * @author marfonjul
 */
public class Fecha {
    int dias;
    int anio;
    int mes;
    public static void main (String [] args){
        Fecha fecha = new Fecha();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese mes");
        int mes =sc.nextInt();
        System.out.println("Ingrese año");
        int anio=sc.nextInt();
        fecha.mes=mes;
        System.out.println(fecha.mes);
        Fecha fecha1=new Fecha();
        fecha1.anio=anio;
        System.out.println(fecha1.anio);
        Fecha fecha2=new Fecha();
        fecha2.dias=obtenerDiasEnMes(fecha.mes,fecha1.anio);
        System.out.println("El mes " + fecha.mes + " en el año " + fecha1.anio + " tiene " + fecha2.dias + " días.");
        //EJERCICIO 1 BOLETIN U3 USO DE OBJETOS

        // Ejemplo de uso

        //int mes = 2; // Febrero

        //int anio = 2023;

 

      //int dias = obtenerDiasEnMes(mes, anio);

      //System.out.println("El mes " + mes + " en el año " + anio + " tiene " + dias + " días.");

    }

 

    /**

     * Método para obtener el número de días en un mes teniendo en cuenta los años bisiestos.

     *

     * @param mes  El mes en formato numérico (1 para enero, 2 para febrero, etc.).

     * @param anio El año en formato numérico.

     * @return El número de días en el mes especificado para el año dado.

     */

    public static int obtenerDiasEnMes(int mes, int anio) {

        // Validar que el mes esté en el rango válido (entre 1 y 12) y que el año sea positivo.

        if (mes < 1 || mes > 12 || anio < 0) {

            throw new IllegalArgumentException("Mes o año no válidos");

        }

 

        // Array para almacenar el número de días en cada mes (sin considerar bisiestos).

        int[] diasEnMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

 

        // Ajustar febrero para años bisiestos.

        if (esBisiesto(anio)) {

            diasEnMes[2] = 29;

        }

 

        // Devolver el número de días en el mes especificado.

        return diasEnMes[mes];

    }

 

    /**

     * Método para verificar si un año es bisiesto.

     *

     * @param anio El año a verificar.

     * @return true si el año es bisiesto, false en caso contrario.

     */

    public static boolean esBisiesto(int anio) {

        // Un año es bisiesto si es divisible por 4, excepto si es divisible por 100 pero no por 400.

        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);

    }
    }
            

