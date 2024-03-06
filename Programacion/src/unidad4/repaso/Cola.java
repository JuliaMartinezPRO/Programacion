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
        System.out.println(cola.size());
        System.out.print(cola.peek());
        System.out.println(cola.poll());
        System.out.println(cola.peek());
        PriorityQueue<Persona> colas = new PriorityQueue<>();
        colas.add("juan");
        colas.add("ana");
        colas.add("luis");
        System.out.println(colas.size());
        System.out.print(colas.peek());
        System.out.println(colas.poll());
        System.out.println(colas.peek());
    }
}
