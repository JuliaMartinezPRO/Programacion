/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad4.repaso;

import java.util.List;

/**
 *
 * @author marfonjul
 */
public class Usuario {
   String nombre;
   String nick;
   int edad;
   String cotraseña;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCotraseña() {
        return cotraseña;
    }

    public void setCotraseña(String cotraseña) {
        this.cotraseña = cotraseña;
    }

    public Usuario(String nombre, String nick, int edad, String cotraseña) {
        this.nombre = nombre;
        this.nick = nick;
        this.edad = edad;
        this.cotraseña = cotraseña;
    }

    
}
