/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3;

import java.util.Scanner;
import static unidad3.EjerciciosUsoDeObjetos.obtenerDiasEnMes;

/**
 *
 * @author marfonjul
 */
public class EjerciciosUsoDeObjetos {

//Ejercicio 1


    public static void main(String[] args) {

        // Ejemplo de uso

        int mes = 2; // Febrero

        int anio = 2023;

 

        int dias = obtenerDiasEnMes(mes, anio);

        System.out.println("El mes " + mes + " en el año " + anio + " tiene " + dias + " días.");

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

 

//Ejercicio 2



 

public class ValidadorFecha {

 

    public static void main(String[] args) {

        // Solicitar la fecha por teclado

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una fecha en formato dd/mm/aaaa: ");

        String fechaIngresada = scanner.nextLine();

        scanner.close();

 

        // Verificar si la fecha es correcta

        if (esFechaValida(fechaIngresada)) {

            System.out.println("La fecha ingresada es válida.");

        } else {

            System.out.println("La fecha ingresada no es válida.");

        }

    }

 

    /**

     * Método para verificar si una fecha en formato dd/mm/aaaa es válida.

     *

     * @param fecha La fecha en formato dd/mm/aaaa a verificar.

     * @return true si la fecha es válida, false en caso contrario.

     */

    public static boolean esFechaValida(String fecha) {

        try {

            // Dividir la fecha en día, mes y año

            String[] partes = fecha.split("/");

            int dia = Integer.parseInt(partes[0]);

            int mes = Integer.parseInt(partes[1]);

            int anio = Integer.parseInt(partes[2]);

 

            // Verificar si el mes y el día son válidos

            if (mes >= 1 && mes <= 12 && dia >= 1 && dia <= obtenerDiasEnMes(mes, anio)) {

                return true;

            } else {

                return false;

            }

        } catch (Exception e) {

            // Capturar cualquier excepción que ocurra al convertir a números

            return false;

        }

    }

 

    // Resto del código del ejercicio anterior (obtenerDiasEnMes y esBisiesto)...

}