/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3.REC;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author marfonjul
 */
public class Ejercicio1 {

    public static void main(String[] args) {

    }

    public static int cocheAlbert() {

        Color AZUL = Color.AZUL;
        Fabricante f = Fabricante.f;
        NºPuertas Dos = NºPuertas.Dos;
        LocalDate fechFab = LocalDate.of(1, Month.MARCH, 0024);
        LocalDate fechMat = LocalDate.of(17, Month.MAY, 0024);
        return 0;

    }

    public static int cocheBerta() {

        Color AZUL = Color.GRIS;
        Fabricante f = Fabricante.x;
        NºPuertas Dos = NºPuertas.cuatro;
        LocalDate fechFab = LocalDate.of(30, Month.MARCH, 0024);
        LocalDate fechMat = LocalDate.of(23, Month.APRIL, 0024);
        return 0;

    }

    public static int cocheMert() {

        Color AZUL = Color.ROJO;
        Fabricante f = Fabricante.z;
        NºPuertas Dos = NºPuertas.cinco;
        LocalDate fechFab = LocalDate.of(10, Month.DECEMBER, 0023);
        LocalDate fechMat = LocalDate.of(23, Month.JANUARY, 0024);

        //Ha habido un error con respecto a la fecha de fabricacion adelanta un mes y 1 semana la fecha
        LocalDate fechaFabcambiada = fechFab.withMonth(1);

        return 0;

    }
}
