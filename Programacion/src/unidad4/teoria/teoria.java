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
    }
    //arrays multidimensionales
    double tabla1 [][] = new  double [3][2]; // 3 filas y dos columnas
    int tabla2 [][] = new int [2][]; //2 filas y varias columnas
    tabla2[0] = new int[2]; //primera fila con 2 columnas
    tabla2[1] = new int[3]; //segunda fila con 3 columnas
    
    System.out.println(tabla1.length);//nº de filas
    System.out.println(tabla2.length);//nº de filas
    System.out.println(tabla2[0].length);//nº de columnas
    System.out.println(tabla2[1].length);//nº de columnas
    
    //otro ejemplo
    private int sumaCol(int[][] matriz, int columna){
        int suma = 0;
        for (int fila = 0; fila < matriz.length; fila++){
            suma += matriz[fila][columna];
            return suma;
        }
        return 0;
    }
}
