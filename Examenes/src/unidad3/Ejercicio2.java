/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3;

import java.util.Scanner;
import static unidad3.Ejercicio2.dia;

/**
 *
 * @author marfonjul
 */
public class Ejercicio2 {
//escribir un método que solicite al usuario una fecha por la entrada estándar e imprima los dias de su semana desde el lunes hasta el domingo
    public static void main(String[] args) {
        //Creamos la clase scanner
        Scanner sc = new Scanner(System.in);
        //Pedir al usuario que ingrese fecha por pantalla
        System.out.println("Ingrese una fecha [12/02/2002]");
        String fecha = sc.nextLine();
        boolean fehca = false;
        //inicializar dia ,mes y año
        int anio = 0, mes = 0, dia = 0;
        //validar fecha
        if (dia > 0 || mes <= 12 || anio < 2011) {
            System.out.println("fecha válida");
        } else {
            System.out.println("fecha no válida , por favor ingrese una fecha válida");
        }

    
       dia[]={'Lunes','Martes','Miercoles','Jueves','Viernes','Sábado','Domingo'};
       mes[]={'Enero','Febrero','Marzo','Abril','Mayo','Junio','Julio','Agosto','Septiembre','Octuebre','Noviembre','Diciembre'};
       int annio = 2000;
       annio[]={'2000','2001','2002','2003','2004','2005','2006','2007','2008','2009','2010','2011'};
       
       }   
    }
