/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad4;
import java.util.Scanner;
/**
 *
 * @author marfonjul
 */
public class boletin4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("ingrese un tamaño de vetor");
        String tamano = sc.nextLine();
        int[] vector = new int[tamano];

        // Rellenar el vector con valores ficticios
        for (int i = 0; i < tamano; i++) {
            // Aquí puedes generar valores ficticios según tus necesidades
            vector[i] = i * 2;
        }

        // Imprimir el contenido del vector en una línea
        System.out.print("Contenido del vector: ");
        for (int i = 0; i < tamano; i++) {
            System.out.print(vector[i]);

            // Agregar un espacio si no es el último elemento
            if (i < tamano - 1) {
                System.out.print(" ");
            }
        }

    
    }
 
}
