/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad4.repaso;

import unidad4.repaso.MarcasO;
import unidad4.repaso.MarcasM;
import unidad4.repaso.MarcasC;
import unidad4.repaso.Color;

/**
 *
 * @author marfonjul
 */
public class Persona {

    public Persona(String kenia, Color rojo, MarcasO dacia, MarcasM dell, MarcasC hawei) {
    }

    String nombre;
    MarcasO ordenador ;
    MarcasM movil;
    MarcasC coche;
    Color color;

    public String getNombre() {
        return nombre;
    }

    public MarcasO getOrdenador() {
        return ordenador;
    }

    public MarcasM getMovil() {
        return movil;
    }

    public MarcasC getCoche() {
        return coche;
    }

    public Color getColor() {
        return color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setOrdenador(MarcasO ordenador) {
        this.ordenador = ordenador;
    }

    public void setMovil(MarcasM movil) {
        this.movil = movil;
    }

    public void setCoche(MarcasC coche) {
        this.coche = coche;
    }

    public void setColor(Color color) {
        this.color = color;
    }

  
    public static void main(String[] args) {

        Persona kenia = new Persona("kenia",color.Rojo,ordenador.DELL,movil.HAWEI,coche.DACIA);
        kenia.setNombre("kenia");
        kenia.setColor(Color.Rojo);
        kenia.setCoche(MarcasC.DACIA);
        kenia.setOrdenador(MarcasO.DELL);
        kenia.setMovil(MarcasM.HAWEI);

        System.out.println(kenia.getNombre());
        System.out.println(kenia.getOrdenador());
        System.out.println(kenia.getMovil());
        System.out.println(kenia.getColor());
        System.out.println(kenia.getCoche());

        Persona alfonso = new Persona("alfonso", color.Rojo, coche.SEAT,ordenador.HP, movil.HAWEI);
        alfonso.setNombre("alfonso");
        alfonso.setOrdenador(MarcasO.HP);
        alfonso.setColor(Color.Rojo);
        alfonso.setCoche(MarcasC.SEAT);
        alfonso.setMovil(MarcasM.HAWEI);

        System.out.println(alfonso.getNombre());
        System.out.println(alfonso.getOrdenador());
        System.out.println(alfonso.getMovil());
        System.out.println(alfonso.getColor());
        System.out.println(alfonso.getCoche());

    }

}
