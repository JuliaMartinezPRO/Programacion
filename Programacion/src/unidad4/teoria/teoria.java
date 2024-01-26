/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad4.teoria;

import java.util.Scanner;
import unidad4.teoria.EjercicioNutriscore;
import java.lang.NoClassDefFoundError;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author marfonjul
 */
public class Teoria {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el estado");
        String estad = sc.nextLine();

        EjercicioNutriscore estado = EjercicioNutriscore.MUYSANO;
        switch (EjercicioNutriscore.valueOf(estad)) {
            case MUYMALO:
                System.out.println("MUY MALO");
                break;
            case MALO:
                System.out.println("MALO");
                break;
            case NEUTRAL:
                System.out.println("NEUTRAL");
                break;
            case SANO:
                System.out.println("SANO");
                break;
            case MUYSANO:
                System.out.println("MUY SANO");
                break;
            default:
        }
        System.out.println("el estado de salud es :" + estado);

        //arrays multidimensionales
        double tabla1[][] = new double[3][2];
        int tabla2[][] = new int[2][];
        tabla2[0] = new int[2];
        tabla2[1] = new int[3];
        System.out.println(tabla1.length); // 3 (número de filas)
        System.out.println(tabla2.length); // 2 (número de filas)
        System.out.println(tabla2[0].length); // 2 (número de columnas)
        System.out.println(tabla2[1].length); // 3 (número de columnas)
        //otro ejemplo

        /**
         *
         * @param matriz
         * @param columna
         */
        /**
         *
         * @param matriz
         * @param columna
         * @return
         */
    }

    private int sumaCol(int[][] matriz, int columna) {
        int suma = 0;
        for (int fila = 0; fila < matriz.length; fila++) {
            suma += matriz[fila][columna];
            return suma;
        }
        return 0;
    }

    //diapositiva 39
//inicializar una matriz
    //matriz de 3 filas y 3 columnas
    private int metodoNuevo(int[][] matriz, int columna) {

        int[][] matriza = {{0, 0, 0}, {1, 1, 1}, {2, 2, 2}};
        // El siguiente ejemplo imprime por pantalla el contenido de una matriz:
        for (int hoya = 0; hoya < matriza.length; hoya++) {
            for (int col = 0; col < matriza[hoya].length; col++) {
                System.out.println(hoya + ":" + col + ":" + matriza[hoya][col]);

            }
        }
        //alternativamente
        //matriz[0][0] = 0;
        //matriz[0][1] = 0;
        //matriz[0][2] = 0;
        //matriz[1][0] = 0;
        //matriz[1][1] = 0;
        //matriz[1][2] = 0;
        //matriz[2][0] = 0;
        //matriz[2][1] = 0;
        //matriz[2][2] = 0;

        //ARRAYLISTS
        //diapositiva 80 unidad4
        ArrayList v = new ArrayList();
        System.err.println("Nº de elementos "+ String.valueOf(v));
        for(int i = 0;i<15;i++){
        v.add(i+1);
        }
        for (Object v1 : v) {
            int j = 0;
            System.out.println("valor"+ v.get(j));
            System.out.println("nº de elementos"+ v.size());
        
        return 0;
        }
        //diapositiva 86 unidad4
        
        LinkedList<String> pila= new LinkedList<>();
        pila.push("primero");
        pila.push("segundo");
        pila.push("tercero");
        pila.push("cuarto");
        pila.push("quinto");
        
        System.out.println("la pila tiene");
        System.out.println(pila.size()+"elementos");
        System.out.println("el primero en salir es :");
        System.out.println(pila.peek());
        
        while (!pila.isEmpty()) {
            System.out.println("eliminando elemento"+pila.pop());
       
        return 0;
        }
        
        //diapositiva 88 unidad4
        Stack<String> pila2 = new Stack<>();
        
        pila2.push("primero");
        pila2.push("segundo");
        pila2.push("tercero");
        pila2.push("cuarto");
        pila2.push("quinto");
        
        System.out.print("La pila tiene ");
        System.out.println(pila.size()+ " elementos");
        System.out.print("El primero en salir es: ");
        System.out.println(pila.peek());
        
        while(!pila2.isEmpty()){
            System.out.println("eliminando elemento"+ pila2.pop());
        }
        return 0;
    }

}
