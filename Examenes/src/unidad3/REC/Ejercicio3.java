/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3.REC;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import javax.swing.text.DateFormatter;

/**
 *
 * @author marfonjul
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        //creamos el objeto Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su fecha de nacimiento en formato(dd/mm/aaa):");
        String fechaNStr = sc.nextLine();
        //parsear la fecha de nacimiento
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(fechaNStr, formatter);
        //obtener el dia de la semana de la fecha de nacimiento
        DayOfWeek diaDeLaSemana = fechaNac.getDayOfWeek();
        //calcular fecha de nacimiento(67 años despues)
        LocalDate fechaJub = fechaNac.plusYears(67);
        System.out.println("SE JUBILARA " + formatter.format(fechaJub));
    }
}
