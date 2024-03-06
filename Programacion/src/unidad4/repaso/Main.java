/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad4.repaso;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author marfonjul
 */
public class Main {

    public static void main(String[] args) {
        Persona kenia = new Persona("kenia", Color.Rojo, MarcasC.DACIA, MarcasO.DELL, MarcasM.HAWEI, ColorPelo.Negro);
        kenia.setNombre("kenia");
        kenia.setColor(Color.Rojo);
        kenia.setCoche(MarcasC.DACIA);
        kenia.setOrdenador(MarcasO.DELL);
        kenia.setMovil(MarcasM.HAWEI);
        kenia.setColorPelo(ColorPelo.Negro);

        System.out.println("Nombre:" + kenia.getNombre());
        System.out.println("Marca de Ordenador:" + kenia.getOrdenador());
        System.out.println("Marca de Móvil:" + kenia.getMovil());
        System.out.println("Color: " + kenia.getColor());
        System.out.println("Marca de coche:" + kenia.getCoche());
        System.out.println("Color de pelo:" + kenia.getColorPelo());
        Persona julia;
        julia = new Persona("alfonso", Color.Rojo, MarcasC.SEAT, MarcasO.HP, MarcasM.HAWEI, ColorPelo.Castaño);
        julia.setNombre("alfonso");
        julia.setOrdenador(MarcasO.HP);
        julia.setColor(Color.Rojo);
        julia.setCoche(MarcasC.SEAT);
        julia.setMovil(MarcasM.HAWEI);
        julia.setColorPelo(ColorPelo.Castaño);
        System.out.println("Nombre:" + julia.getNombre());
        System.out.println("Marca de Ordenador:" + julia.getOrdenador());
        System.out.println("Marca de Móvil:" + julia.getMovil());
        System.out.println("Color:" + julia.getColor());
        System.out.println("Marca de coche:" + julia.getCoche());
        System.out.println("Color de pelo:" + julia.getColorPelo());
        Persona alfonso;
        alfonso = new Persona("alfonso", Color.Rojo, MarcasC.SEAT, MarcasO.HP, MarcasM.HAWEI, ColorPelo.Castaño);
        alfonso.setNombre("alfonso");
        alfonso.setOrdenador(MarcasO.HP);
        alfonso.setColor(Color.Rojo);
        alfonso.setCoche(MarcasC.SEAT);
        alfonso.setMovil(MarcasM.HAWEI);
        alfonso.setColorPelo(ColorPelo.Castaño);
        System.out.println("Nombre:" + alfonso.getNombre());
        System.out.println("Marca de Ordenador:" + alfonso.getOrdenador());
        System.out.println("Marca de Móvil:" + alfonso.getMovil());
        System.out.println("Color:" + alfonso.getColor());
        System.out.println("Marca de coche:" + alfonso.getCoche());
        System.out.println("Color de pelo:" + alfonso.getColorPelo());

        //define un array de 3 personas con el nombre "Equipo" y añadele 3 personas
        Persona equipo[] = new Persona[3];
        equipo[0] = kenia;
        equipo[1] = julia;
        equipo[2] = alfonso;
        //verificar la longitud del array
        System.out.println("longitud array:" + equipo.length);
        //crear una copia del array y eliminar el primer elemento 
        Persona [] copia = Arrays.copyOf(equipo, 3);
        for(Persona alfa:copia){
            System.out.println("copia personas"+alfa);
        }
        //ahora eliminar el primer elemento hacer una copia e imprimirlo
        Persona.Shift();
        Persona [] copia2 = Arrays.copyOf(equipo,2);
        for(Persona elfa: copia2){
            System.out.println("copia sin el primer elemento"+elfa);
        }
        
    }

}
