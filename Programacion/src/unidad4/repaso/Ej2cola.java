/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad4.repaso;

import java.util.LinkedList;

/**
 *
 * @author marfonjul
 */
public class Ej2cola {
    public static void main(String []args){
        //crea un programa que simule la cola de un supermercado a ka que podemos:
        //Añadir nuevos clientes
        //mirar los clientes que hay en la cola
        //cobrar al cliente que esté primero en la cola
        //Obtener el total de lo que hemos cobrado
        LinkedList<String> supermercado = new LinkedList<>();
        supermercado.add("cliente1");
        supermercado.add("cliente2");
        supermercado.add("cliente3");
        supermercado.add("cliente4");
        supermercado.add("cliente5");
        supermercado.add("cliente6");
        System.out.println(supermercado.size());
        System.out.println(supermercado.peek());
        System.out.println(supermercado.poll());
        System.out.println(supermercado.peek());
        
        
    }
}
