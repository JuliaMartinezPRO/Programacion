/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad4.repaso;

import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 *
 * @author marfonjul
 */
public class Cola {

    public static void main(String[] args) {
        LinkedList<Persona> cola = new LinkedList<>();
        cola.add("juan");
        cola.add("ana");
        cola.add("luis");
        System.err.println(cola.size());
        System.out.print(cola.peek());
        System.err.println(cola.poll());
        System.err.println(cola.peek());
        PriorityQueue<Persona> colas = new PriorityQueue<>();
        colas.add("juan");
        colas.add("ana");
        colas.add("luis");
        System.err.println(colas.size());
        System.out.print(colas.peek());
        System.err.println(colas.poll());
        System.err.println(colas.peek());
    }
}
