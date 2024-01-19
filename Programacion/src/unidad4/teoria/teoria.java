/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad4.teoria;
import java.util.Scanner;
import unidad4.teoria.EjercicioNutriscore;

/**
 *
 * @author marfonjul
 */
public class Teoria {
    
    
    public static void main(String [] args){
      
        Scanner sc = new Scanner(System.in);
         System.out.println("ingrese el estado");
        String estad = sc.nextLine();
       
       EjercicioNutriscore estado = EjercicioNutriscore.MUYSANO;
        switch(estado){
            case MUYMALO:
                estado=EjercicioNutriscore.MUYMALO;
                break;
            case MALO:
                estado=EjercicioNutriscore.MALO;
                break;
            case NEUTRAL:
                estado=EjercicioNutriscore.NEUTRAL;
                break;
            case SANO:
                estado=EjercicioNutriscore.SANO;
                break;
            case MUYSANO:
                estado=EjercicioNutriscore.MUYSANO;
                break;
            default:
        }
        System.out.println("el estado de salud es :" + estado);
    
    //arrays multidimensionales
    double tabla1 [][] = new double[3][2];
    int tabla2[][] = new int[2][];
    tabla2[0] = new int[2];
    tabla2[1] = new int[3];
    System.out.println(tabla1.length); // 3 (número de filas)
    System.out.println(tabla2.length); // 2 (número de filas)
    System.out.println(tabla2[0].length); // 2 (número de columnas)
    System.out.println(tabla2[1].length); // 3 (número de columnas)
    //otro ejemplo
    private  int sumaCol(int[][] matriz, int columna){
        int suma = 0;
        for (int fila = 0; fila < matriz.length; fila++){
            suma += matriz[fila][columna];
            return suma;
        }
        return 0;
    }
//inicializar una matriz
    //matriz de 3 filas y 3 columnas
    int[][] matriz ={ {0,0,0}, {1,1,1}, {2,2,2}};
    // El siguiente ejemplo imprime por pantalla el contenido de una matriz:
     for (int fila = 0; fila<matriz.length; fila++){
    for (int col=0; col<matriz[fila].length; col++){
        System.err.println(fila +":" + col + ":" + matriz[fila][col]);
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
    
    //código que rellenase el cubo con valores aleatorios, podría ser el
//siguiente
 int [][][][] cubo = new int [4][4][4][4];
 for (int x = 0; x<cubo.length; x++){
    for (int y = 0; y<cubo[x].length; y++){
        for (int z=0; z<cubo[x][y].length; z++){}
          //  cubo[x][y][z] = (int)(Math.random()* 6);
    }
}
 
    public static void main(String[] args) {
        int[] enteros = {1, 2, 3};
        prueba(enteros);
        for(int i=0; i<enteros.length; i++){
            System.out.println(enteros[i]);
        }
        public void prueba(int [] enteros){
            for(int i=0; i<enteros.length; i++){
                enteros[i] *=2;
            }
        }
    }
}
}
