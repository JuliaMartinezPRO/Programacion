/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3.repaso;

import java.time.LocalDate;
import java.time.LocalDate;
import static java.time.temporal.TemporalQueries.localDate;

/**
 *
 * @author marfonjul
 */
public class Estudiante {
    String nombre;
    int edad;
    localDate fechaNac;
    LocalDate fechaInC;
    interface Curso{
        enum CursoA implements Curso{
            PRIMERO, SEGUNDO
        }
    }
    double codNADN;
    interface Modulo{
        enum ModuloP implements Modulo{
            PROGRAMACION, CODE, INGLES
        }
    }

    public static void main(String[] args) {
        Estudiante pepe = new Estudiante("pepe", "code", "primero",20, 33418127,"2023-09-1","2004-01-17", "2004-01-17", "2004-01-17");
        pepe.nombre="pepe";
        pepe.edad = 20;
        Modulo = Modulo.ModuloP.CODE;
        pepe.codNADN = 33418127;
        pepe.cursoAc = "primero";
        pepe.fechaInC = "2023-09-1";
        pepe.fechaNac ="2004-01-17";
        System.out.println(pepe.nombre + pepe.codNADN + pepe.edad + pepe.fechaInC + pepe.fechaNac + pepe.cursoAc);

        
        
        Estudiante titi = new Estudiante("titi","segundo", "ingles", 22,343171717, "2023-09-1", "2002-01-19", "2004-01-17", "2004-01-17");
        titi.nombre="titi";
        titi.codNADN = 343171717;
        titi.cursoAc = "segundo";
        titi.edad=22;
        titi.fechaInC ="2023-09-1";
        titi.moduloP = "ingles";
        titi.fechaNac ="2002-01-19";
        System.out.println(titi.nombre + titi.codNADN + titi.edad + titi.fechaInC + titi.fechaNac + titi.cursoAc);
        
        
        Estudiante nano = new Estudiante("nano","segundo", "programacion", 33,323171717, "2023-09-1", "2001-01-17", "2004-01-17", "2004-01-17");
        nano.nombre="nano";
        nano.codNADN=323171717;
        nano.cursoAc = "segundo";
        nano.edad=23;
        nano.fechaInC="2023-09-1";
        nano.fechaNac="2001-01-17";
        nano.moduloP="programacion";
         System.out.println(nano.nombre + nano.codNADN + nano.edad + nano.fechaInC + nano.fechaNac + nano.cursoAc);
    }
    //definir constructor

    public Estudiante(String moduloP, String primero, String string, int edad, int par1, String string2, String string3, String string5, String string7) {
        this.edad = edad;
        this.moduloP = moduloP;
    }

    private  void estudiar() {
        System.out.println("estudiar");
    }

    private static void preguntar() {
        System.out.println("preguntar");
    }

    private static void calcularADN() {
        System.out.println("calcular ADN");
    }
}
