/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3.repaso;

import java.time.*;
import java.time.format.*;
import static java.time.temporal.TemporalQueries.localDate;

/**
 *
 * @author marfonjul
 */
public class Estudiante {
    String nombre;
    int edad;
    LocalDate fechaNac=LocalDate.now();
    LocalDate fechaInC=LocalDate.now();
    private Modulo.ModuloP modulo;
    private boolean cursoAc;
    private final String moduloP;
    private Curso.CursoA curso;

    private static class localDate {

        public localDate() {
        }
    }
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
        pepe.modulo = Modulo.ModuloP.CODE;
        pepe.codNADN = 33418127;
        pepe.curso = Curso.CursoA.PRIMERO;
        pepe.fechaInC = LocalDate.of(2023, Month.SEPTEMBER, 1);
        pepe.fechaNac =LocalDate.of(2004, Month.JANUARY, 17);
        System.out.println(pepe.nombre + pepe.codNADN + pepe.edad + pepe.fechaInC + pepe.fechaNac + pepe.cursoAc);

        
        
        Estudiante titi = new Estudiante("titi","segundo", "ingles", 22,343171717, "2023-09-1", "2002-01-19", "2004-01-17", "2004-01-17");
        titi.nombre="titi";
        titi.codNADN = 343171717;
        titi.curso = Curso.CursoA.SEGUNDO;
        titi.edad=22;
        titi.fechaInC = LocalDate.of(2023, Month.SEPTEMBER, 1);
        titi.modulo = Modulo.ModuloP.INGLES;
        titi.fechaNac =LocalDate.of(2002, Month.JANUARY, 19);
        System.out.println(titi.nombre + titi.codNADN + titi.edad + titi.fechaInC + titi.fechaNac + titi.cursoAc);
        
        
        Estudiante nano = new Estudiante("nano","segundo", "programacion", 33,323171717, "2023-09-1", "2001-01-17", "2004-01-17", "2004-01-17");
        nano.nombre="nano";
        nano.codNADN=323171717;
        nano.curso = Curso.CursoA.SEGUNDO;
        nano.edad=23;
        nano.fechaInC = LocalDate.of(2023, Month.SEPTEMBER, 1);
        nano.fechaNac=LocalDate.of(2001, Month.JANUARY, 17);
        nano.modulo=Modulo.ModuloP.PROGRAMACION;
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
