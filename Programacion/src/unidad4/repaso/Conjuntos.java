/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad4.repaso;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 *
 * @author marfonjul
 */
public class Conjuntos {

    public static void main(String[] args) {
        HashSet<String> conjunto = new HashSet();
        conjunto.add("enero");
        conjunto.add("enero");
        conjunto.add("febrero");
        conjunto.add("marzo");
        conjunto.add("abril");
        conjunto.add("mayo");
        conjunto.add("junio");
        conjunto.add("julio");
        conjunto.add("agosto");
        conjunto.add("septiembre");
        conjunto.add("octuebre");
        conjunto.add("noviembre");
        conjunto.add("diciembre");
        conjunto.add(null);
        conjunto.add(null);

        System.out.println("HASHSET  " + conjunto);

        //crea un conjunto linkedhashset con nulos y duplicados
        LinkedHashSet<String> listahas = new LinkedHashSet();
        listahas.add("enero");
        listahas.add("enero");
        listahas.add("febrero");
        listahas.add("marzo");
        listahas.add("abril");
        listahas.add("mayo");
        listahas.add("junio");
        listahas.add("julio");
        listahas.add("agosto");
        listahas.add("septiembre");
        listahas.add("octuebre");
        listahas.add("noviembre");
        listahas.add("diciembre");
        listahas.add(null);
        listahas.add(null);

        System.out.println("linkedhashset  " + listahas);

        //AQUI NO ADMIT EL NULL
        TreeSet<String> treS = new TreeSet();
        treS.add("enero");
        treS.add("enero");
        treS.add("febrero");
        treS.add("marzo");
        treS.add("abril");
        treS.add("mayo");
        treS.add("junio");
        treS.add("julio");
        treS.add("agosto");
        treS.add("septiembre");
        treS.add("octuebre");
        treS.add("noviembre");
        treS.add("diciembre");
        treS.add(null);
        treS.add(null);

        System.out.println("TREESET  " + treS);

        //EJERCICIO 2 CREA UNA APLICACION DONDE INSERTARAS LAS MARCAS DE MOVILES DE VARIAS PERSONAS
        //SACA POR PANTALLAS TODAS LAS MARCAS QUE INSERTASTE PERO SIN QUE APAREZCAN REPETIDAS
        //CALCULA CUANTAS MARCAS DIFERENTES AS INTRODUCIDO 
        HashSet<String> persona = new HashSet();
        persona.add("julia");
        MarcasM julia = MarcasM.HAWEI;
        persona.add("juan");
        MarcasM juan = MarcasM.IPOHONE;
        persona.add("melvin");
        MarcasM melvin = MarcasM.SAMSUNG;
        persona.add("juana");
        MarcasM juana = MarcasM.SAMSUNG;
        
    }
}
