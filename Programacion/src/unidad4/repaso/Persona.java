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
import unidad4.repaso.ColorPelo;

/**
 *
 * @author marfonjul
 */
public class Persona implements compareTo{

    static void Shift() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //Constructor
    public Persona(String nombre, MarcasO ordenador, MarcasM movil, MarcasC coche, Color color, ColorPelo colorPelo) {
        this.nombre = nombre;
        this.ordenador = ordenador;
        this.movil = movil;
        this.coche = coche;
        this.color = color;
        this.colorPelo = colorPelo;
    }

    public Persona(String kenia, Color rojo, MarcasC hawei, MarcasO dacia, MarcasM dell, ColorPelo Negro) {
    }

    String nombre;
    MarcasO ordenador ;
    MarcasM movil;
    MarcasC coche;
    Color color;
    ColorPelo colorPelo;
//otros constructores
    
    public Persona(String nombre, ColorPelo colorPelo) {
        this.nombre = nombre;
        this.colorPelo = colorPelo;
    }

    Persona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ColorPelo getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(ColorPelo colorP) {
        this.colorPelo = colorP;
    }
    

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
public int compareTo(Persona otraPersona){
    return this.nombre.compareTo(otraPersona,nombre);
}
}

