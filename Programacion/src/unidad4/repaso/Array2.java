/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad4.repaso;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author marfonjul
 */
public class Array2 {

    public static void main(String[] args) {

        ArrayList lista = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese Nombre");
        lista.add(sc.next());
        System.out.print("Ingrese Nick");
        lista.add(sc.next());
        System.out.print("Ingrese edad");
        lista.add(sc.next());
        System.out.print("Ingrese Contraseña");
        lista.add(sc.next());
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));

        }
    }
}
